package com.abc.healthcare.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="payment_tbl")
public class PaymentEntity {
	
	@Id
	@Column(name="payment_id")
	private int paymentId;
	
	@Column(name="payment_date")
	private LocalDate paymentDate;
	
	@Column(name="payment_method")
	private String paymentMethod;
	
	@Column(name="payment_amount")
	private double paymentAmount;
	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private PatientEntity patient;
	
	@OneToOne
	@JoinColumn(name = "bill_id")
	private BillEntity bill;
	
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	

}