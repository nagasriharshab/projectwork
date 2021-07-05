package com.abc.healthcare.service;
import com.abc.healthcare.exceptions.ResourceAlreadyExistException;
import com.abc.healthcare.exceptions.ResourceNotFoundException;
import com.abc.healthcare.model.Doctor;


/**
 * 
 * @author NAGA SRI HARSHA
 *date : 05-July-2021
 */
public interface DoctorService {
 /**
  * 
  * @param doctor
  * @throws ResourceAlreadyExistException
  */
 public void saveDoctor(Doctor doctor) throws ResourceAlreadyExistException;
 /**
  * 
  * @param DoctorId
  * @return required Doctor Details
  * @throws ResourceNotFoundException
  */
 public Doctor findDoctorbyId(int id) throws ResourceNotFoundException;
 /**
  * 
  * @param DoctorId
  * @throws ResourceNotFoundException
  */
 public void deleteDoctorbyId(int id)throws ResourceNotFoundException;
 /**
  * 
  * @param name
  * @return Required Doctor Details
  * @throws ResourceNotFoundException
  */
 public Doctor findDoctorbyName(String name) throws ResourceNotFoundException;
 /**
  * 
  * @param doctor
  * @throws ResourceNotFoundException
  */
 public void updateDoctorbyId(Doctor doctor) throws ResourceNotFoundException;
}
