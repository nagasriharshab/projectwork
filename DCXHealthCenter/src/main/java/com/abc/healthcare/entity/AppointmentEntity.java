package com.abc.healthcare.entity;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Appointment_tbl")
public class AppointmentEntity {
	@Id
	@Column(name ="appointment_id")
	private int AppointmentId;
	
	@Column(name ="appointment_date")
	private LocalDate AppointmentDate;
	
	@Column(name = "appointment_slot")
	private int AppointmentSlot;
	
	@ManyToOne
	@JoinColumn(name = "patient_id")
	private PatientEntity patient;
	
	@ManyToOne
	@JoinColumn(name="doctor_id")
	private DoctorEntity doctor;
	
	@OneToOne(mappedBy = "appointment",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private BillEntity bill;

	
	public int getAppointmentSlot() {
		return AppointmentSlot;
	}

	public int getAppointmentId() {
		return AppointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		AppointmentId = appointmentId;
	}

	public LocalDate getAppointmentDate() {
		return AppointmentDate;
	}

	public void setAppointmentDate(LocalDate appointmentDate) {
		AppointmentDate = appointmentDate;
	}

	public int getSlot() {
		return AppointmentSlot;
	}

	public void setAppointmentSlot(int appointmentSlot) {
		AppointmentSlot = appointmentSlot;
	}

	public PatientEntity getPatient() {
		return patient;
	}

	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}

	public DoctorEntity getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorEntity doctor) {
		this.doctor = doctor;
	}

	public BillEntity getBill() {
		return bill;
	}

	public void setBill(BillEntity bill) {
		this.bill = bill;
	}
	
}
