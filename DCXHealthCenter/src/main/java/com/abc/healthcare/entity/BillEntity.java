package com.abc.healthcare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bill_tbl")
public class BillEntity {
	
	@Id
	@Column(name="bill_id")
	private int billId;
	
	@Column(name="bill_amount")
	private double billAmount;
	
	@OneToOne
	@JoinColumn(name = "appointment_id")
	private AppointmentEntity appointment;
	
	@OneToOne
	@JoinColumn(name= "payment_id")
	private PaymentEntity payment;
	
	
	public AppointmentEntity getAppointment() {
		return appointment;
	}
	public void setAppointment(AppointmentEntity appointment) {
		this.appointment = appointment;
	}
	public PaymentEntity getPayment() {
		return payment;
	}
	public void setPayment(PaymentEntity payment) {
		this.payment = payment;
	}
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
}
