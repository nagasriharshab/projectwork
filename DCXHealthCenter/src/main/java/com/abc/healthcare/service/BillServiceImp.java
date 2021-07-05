package com.abc.healthcare.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.abc.healthcare.entity.BillEntity;
import com.abc.healthcare.exceptions.ResourceAlreadyExistException;
import com.abc.healthcare.exceptions.ResourceNotFoundException;
import com.abc.healthcare.model.Bill;
import com.abc.healthcare.repository.BillRepository;
@Service
public class BillServiceImp implements BillService{
private BillRepository billRepository;
	@Override
	public void saveBill(Bill bill) throws ResourceAlreadyExistException {
		Optional<BillEntity> billEntity = billRepository.findById(bill.getBillId());
		if(billEntity.isPresent()) {
			throw new ResourceAlreadyExistException("Bill already exist with this id "+bill.getBillId());
		}
		else {
			BillEntity billEntity1 = convertModeltoEntity(bill);
			billRepository.save(billEntity1);
		}	
	}

	@Override
	public Bill findBillbyId(int id) throws ResourceNotFoundException {
		Optional<BillEntity> billEntity = billRepository.findById(id);
		Bill bill = null;
		if(billEntity.isPresent()) {
			bill = convertEntitytoModel(billEntity);
			return bill;
		}
		else {
			throw new ResourceNotFoundException("No bill found with this ID"+id);
		}
	}

	private BillEntity convertModeltoEntity(Bill bill) {
		BillEntity billEntity = new BillEntity();
		billEntity.setBillId(bill.getBillId());
		billEntity.setBillAmount(bill.getBillAmount());
		return billEntity;
		
	}
	private Bill convertEntitytoModel(Optional<BillEntity> billEntity) {
		Bill bill = new Bill();
		bill.setBillId(billEntity.get().getBillId());
		bill.setBillAmount(billEntity.get().getBillAmount());
		bill.setAppointmentId(billEntity.get().getAppointment().getAppointmentId());
		bill.setPaymentId(billEntity.get().getPayment().getPaymentId());
		return bill;
	}
}
