package com.abc.healthcare.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.abc.healthcare.entity.DoctorEntity;
import com.abc.healthcare.exceptions.ResourceAlreadyExistException;
import com.abc.healthcare.exceptions.ResourceNotFoundException;
import com.abc.healthcare.model.Doctor;
import com.abc.healthcare.repository.DoctorRepository;
@Service
public class DCXServiceImp implements DCXService{

	@Autowired
	private DoctorRepository doctorRepository;
	@Override
	public void saveDoctor(Doctor doctor) throws ResourceAlreadyExistException {
		Optional<DoctorEntity> doctorEntity1 = doctorRepository.findById(doctor.getDoctorID());
		if(doctorEntity1.isPresent()) {
			throw new ResourceAlreadyExistException("Doctor already exists with this ID"+doctor.getDoctorID());
		}
		else {
			DoctorEntity doctorEntity = new DoctorEntity();
			doctorEntity.setDoctorID(doctor.getDoctorID());
			doctorEntity.setDoctorName(doctor.getDoctorName());
			doctorEntity.setDoctorContact(doctor.getDoctorContact());
			doctorEntity.setDoctorDepartment(doctor.getDoctorDepartment());
			doctorEntity.setDoctorEmail(doctor.getDoctorEmail());
			doctorEntity.setDoctorExperience(doctor.getDoctorExperience());
			doctorEntity.setDoctorGender(doctor.getDoctorGender());
			doctorEntity.setDoctorQualification(doctor.getDoctorQualification());
			doctorEntity.setDoctorAddress(doctor.getDoctorAddress());
			doctorEntity.setDoctorUserName(doctor.getDoctorUserName());
			doctorEntity.setDoctorPassword(doctor.getDoctorPassword());
			doctorEntity.setAppointments(null);
			doctorRepository.save(doctorEntity);
	
			
		}
		
	}
	public Doctor findDoctorbyId(int id) throws ResourceNotFoundException{
		Doctor doctor = new Doctor();
		Optional<DoctorEntity> doctorEntity = doctorRepository.findById(id);
		if(doctorEntity.isPresent()) {
			doctor.setDoctorID(doctorEntity.get().getDoctorID());
			doctor.setDoctorName(doctorEntity.get().getDoctorName());
			doctor.setDoctorEmail(doctorEntity.get().getDoctorEmail());
			doctor.setDoctorContact(doctorEntity.get().getDoctorContact());
			doctor.setDoctorDepartment(doctorEntity.get().getDoctorDepartment());
			doctor.setDoctorExperience(doctorEntity.get().getDoctorExperience());
			doctor.setDoctorGender(doctorEntity.get().getDoctorGender());
			doctor.setDoctorQualification(doctorEntity.get().getDoctorQualification());
			doctor.setDoctorAddress(doctorEntity.get().getDoctorAddress());
			doctor.setDoctorUserName(doctorEntity.get().getDoctorUserName());
			doctor.setDoctorPassword(doctorEntity.get().getDoctorPassword());
			return doctor;
		}
		else {
			throw new ResourceNotFoundException("Cannot find doctor with this ID"+id);
		}
	}
	@Override
	public void deleteDoctorbyId(int id)throws ResourceNotFoundException{
		Optional<DoctorEntity> doctorEntity = doctorRepository.findById(id);
		if(doctorEntity.isPresent()) {
			doctorRepository.deleteById(id);
		}
		else {
			throw new ResourceNotFoundException("Cannot find doctor with this ID "+id);
		}
	}
}
