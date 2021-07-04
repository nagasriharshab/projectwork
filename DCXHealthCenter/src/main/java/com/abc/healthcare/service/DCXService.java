package com.abc.healthcare.service;
import com.abc.healthcare.exceptions.ResourceAlreadyExistException;
import com.abc.healthcare.exceptions.ResourceNotFoundException;
import com.abc.healthcare.model.Doctor;

public interface DCXService {
 public void saveDoctor(Doctor doctor) throws ResourceAlreadyExistException;
 public Doctor findDoctorbyId(int id) throws ResourceNotFoundException;
 public void deleteDoctorbyId(int id)throws ResourceNotFoundException;
}
