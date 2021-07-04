package com.abc.healthcare.model;

import java.time.LocalDate;

public class Appointment {
	
	private int AppointmentId;
	
	private LocalDate AppointmentDate;
	
	private int AppointmentSlot;
	
	private int patientId;

	private int doctorId;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
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

	public int getAppointmentSlot() {
		return AppointmentSlot;
	}

	public void setAppointmentSlot(int appointmentSlot) {
		AppointmentSlot = appointmentSlot;
	}
	
	
}
