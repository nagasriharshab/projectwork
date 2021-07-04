package com.abc.healthcare.controller;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.healthcare.model.Doctor;
import com.abc.healthcare.model.Response;
import com.abc.healthcare.service.DCXService;

@RestController
@Validated
@RequestMapping("/doctor")
public class DoctorController {
	Response response = new Response();
	@Autowired
	private DCXService dcxService;
	@PostMapping("/save")
	public ResponseEntity<?> addDoctor(@Valid @RequestBody Doctor doctor){
		dcxService.saveDoctor(doctor);
		
		response.setMsg("Hello Doctor "+doctor.getDoctorName()+", Welcome to DCX HealthCare.Your details are saved and now you can login with your username and password to check your appointments");
		response.setStatus(HttpStatus.CREATED.value());
		return new ResponseEntity<>(response,HttpStatus.CREATED);
	}
	
	@PostMapping("/find/{id}")
	public ResponseEntity<?> findDoctor(@Valid @Min(1) @PathVariable int id){
		Doctor doctor = dcxService.findDoctorbyId(id);
		return new ResponseEntity<>(doctor,HttpStatus.FOUND);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<?> deleteDoctor(@Valid @Min(1) @PathVariable int id){
		dcxService.deleteDoctorbyId(id);
		response.setMsg("Deleted successfully");
		response.setStatus(HttpStatus.FOUND.value());
		return new ResponseEntity<>(response,HttpStatus.FOUND);
	}
}
