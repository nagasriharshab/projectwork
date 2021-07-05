package com.abc.healthcare.controller;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.healthcare.model.Bill;
import com.abc.healthcare.model.Response;
import com.abc.healthcare.service.BillService;


/**
 * @author PRASANNA
 *
 */
@RestController
@RequestMapping("/bill")
public class BillController {

	Response response = new Response();
	private static final Logger LOGGER = LoggerFactory.getLogger(BillController.class);

	@Autowired
	private BillService billService;
	/**
	 * 
	 * @param bill =  Bill object that need to be saved
	 * @return response message whether it is success or not
	 */
	@PostMapping("/save")
	public ResponseEntity<?> addBill(@Valid @RequestBody Bill bill){
		LOGGER.info("billServiceImp::saveBill(Bill bill) method called");
		billService.saveBill(bill);
		response.setMsg("Bill saved");
		response.setStatus(HttpStatus.CREATED.value());
		return new ResponseEntity<>(response,HttpStatus.CREATED);
	}
	/**
	 * 
	 * @param id= ID to find the bill
	 * @return bill if it is found or failure response if the task failed
	 */
	@PostMapping("/find/{id}")
	public ResponseEntity<?> findBill(@Valid @Min(1) @PathVariable int id){
		LOGGER.info("billServiceImp::findBill(Bill bill) method called");
		Bill bill = billService.findBillbyId(id);
		return new ResponseEntity<>(bill,HttpStatus.FOUND);
	}
	
}
