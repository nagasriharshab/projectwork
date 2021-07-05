package com.abc.healthcare.service;

import com.abc.healthcare.exceptions.ResourceAlreadyExistException;
import com.abc.healthcare.exceptions.ResourceNotFoundException;
import com.abc.healthcare.model.Bill;

public interface BillService {
	
	public void saveBill(Bill bill) throws ResourceAlreadyExistException;
	public Bill findBillbyId(int id) throws ResourceNotFoundException;
}
