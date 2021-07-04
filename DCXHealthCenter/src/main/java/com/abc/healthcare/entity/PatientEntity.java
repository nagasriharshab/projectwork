package com.abc.healthcare.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table (name = "patient_table")
public class PatientEntity {
	@Id
	@Column(name ="patient_Id")
	private int patientId ;
	
	@Column(name = "patient_name")
	private String patientName;
	
	@Column(name="patient_user_name")
	private String patientUserName;
	
	@Column(name="patient_password")
	private String patientPassword;
	
	@Column(name = "patient_age")
	private int patientAge;
	
	@Column(name = "patient_gender")
	private String patientGender;
	
	@Column(name = "patient_address")
	private String patientAddress;
	
	@Column(name = "patient_email")
	private String patientEmail;
	
	@Column(name = "patient_contact")
	private long patientContact;
	
	@Column(name = "patient_message")
	private String patientMessage;
	
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List <AppointmentEntity> appointments = new ArrayList <>();
	
	@OneToMany(mappedBy="patient", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<PaymentEntity> payments = new ArrayList<>();
	
	
	public String getPatientUserName() {
		return patientUserName;
	}

	public void setPatientUserName(String patientUserName) {
		this.patientUserName = patientUserName;
	}

	public String getPatientPassword() {
		return patientPassword;
	}

	public void setPatientPassword(String patientPassword) {
		this.patientPassword = patientPassword;
	}

	public List<AppointmentEntity> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<AppointmentEntity> appointments) {
		this.appointments = appointments;
	}

	public List<PaymentEntity> getPayments() {
		return payments;
	}

	public void setPayments(List<PaymentEntity> payments) {
		this.payments = payments;
	}

	
	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientGender() {
		return patientGender;
	}

	public void setPatientGender(String patientGender) {
		this.patientGender = patientGender;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	public String getPatientEmail() {
		return patientEmail;
	}

	public void setPatientEmail(String patientEmail) {
		this.patientEmail = patientEmail;
	}

	public long getPatientContact() {
		return patientContact;
	}

	public void setPatientContact(long patientContact) {
		this.patientContact = patientContact;
	}

	public String getPatientMessage() {
		return patientMessage;
	}

	public void setPatientMessage(String patientMessage) {
		this.patientMessage = patientMessage;
	}
}
