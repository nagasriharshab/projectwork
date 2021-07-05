package com.abc.healthcare.controller;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.healthcare.model.Doctor;
import com.abc.healthcare.model.Response;
import com.abc.healthcare.service.DoctorService;

/**
 * @author NAGA SRI HARSHA
 *date : 05-July-2021
 */
@RestController
@Validated
@RequestMapping("/doctor")
public class DoctorController {
	
	Response response = new Response();
	
	@Autowired
	private DoctorService doctorService;
    
	private static final Logger LOGGER = LoggerFactory.getLogger(DoctorController.class);
   
	/**
	 * Method to add doctor details
	 * @param doctor
	 * @return response entity containing the reply to request made and the status
	 */
	@PostMapping("/save")
	public ResponseEntity<?> addDoctor(@Valid @RequestBody Doctor doctor){
		LOGGER.info("doctorServiceImp::saveDoctor(Doctor doctor) method called");
		doctorService.saveDoctor(doctor);
		response.setMsg("Hello Doctor "+doctor.getDoctorName()+", Welcome to DCX HealthCare.Your details are saved and now you can login with your username and password to check your appointments");
		response.setStatus(HttpStatus.CREATED.value());
		return new ResponseEntity<>(response,HttpStatus.CREATED);
	}
	
	/**
	 * Method to find the Doctor based on DoctorId
	 * @param id
	 * @return response entity containing the reply to request made and the status
	 */
	@PostMapping("/find/{id}")
	public ResponseEntity<?> findDoctor(@Valid @Min(1) @PathVariable int id){
		LOGGER.info("doctorServiceImp::findDoctor(Doctor doctor) method called");
		Doctor doctor = doctorService.findDoctorbyId(id);
		return new ResponseEntity<>(doctor,HttpStatus.FOUND);
	}
	
	/**
	 * Method to delete the doctor based on DoctorId
	 * @param id
	 * @return response entity containing the reply to request made and the status
	 */
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteDoctor(@Valid @Min(1) @PathVariable int id){
		doctorService.deleteDoctorbyId(id);
		response.setMsg("Deleted successfully");
		response.setStatus(HttpStatus.FOUND.value());
		return new ResponseEntity<>(response,HttpStatus.FOUND);
	}
	/**
	 * Method to find the doctor by doctorName
	 * @param name
	 * @return response entity containing the reply to request made and the status
	 */
	@PostMapping("/findbyName/{name}")
	public ResponseEntity<?> findDoctorbyNameMethod(@Valid @PathVariable String name){
		Doctor doctor = doctorService.findDoctorbyName(name);
		return new ResponseEntity<>(doctor,HttpStatus.FOUND);
	}
	/**
	 * Method to update existing doctor details
	 * @param doctor
	 * @return response entity containing the reply to request made and the status
	 */
	@PutMapping("/update")
	public ResponseEntity<?> updateDoctor(@Valid @RequestBody Doctor doctor){
		doctorService.updateDoctorbyId(doctor);
		response.setMsg("Hello Doctor "+doctor.getDoctorName()+",details are updated");
		response.setStatus(HttpStatus.FOUND.value());
		return new ResponseEntity<>(response,HttpStatus.FOUND);
	}
}
