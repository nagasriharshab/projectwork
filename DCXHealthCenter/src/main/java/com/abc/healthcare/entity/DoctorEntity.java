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

@Table(name="doctor_tbl")
public class DoctorEntity {

	@Id
	@Column(name="doctor_id")
	private int doctorID;

	@Column(name="doctor_name")
	private String doctorName;
	
	@Column(name="doctor_user_name")
	private String doctorUserName;
	
	@Column(name="doctor_password")
	private String doctorPassword;

	@Column(name="doctor_email")
	private  String doctorEmail;

	@Column(name="doctor_contact")
	private long doctorContact;

	@Column(name="doctor_gender")
	private String doctorGender;

	@Column(name="doctor_experience")
	private int doctorExperience;

	@Column(name="doctor_department")
	private String doctorDepartment;

	@Column(name="doctor_qualification")
	private String doctorQualification;
	
	@Column(name = "doctor_address")
	private String doctorAddress;
	
	@OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List <AppointmentEntity> appointments = new ArrayList <>();

	public int getDoctorID() {
		return doctorID;
	}

	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorUserName() {
		return doctorUserName;
	}

	public void setDoctorUserName(String doctorUserName) {
		this.doctorUserName = doctorUserName;
	}

	public String getDoctorPassword() {
		return doctorPassword;
	}

	public void setDoctorPassword(String doctorPassword) {
		this.doctorPassword = doctorPassword;
	}

	public String getDoctorEmail() {
		return doctorEmail;
	}

	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	public long getDoctorContact() {
		return doctorContact;
	}

	public void setDoctorContact(long doctorContact) {
		this.doctorContact = doctorContact;
	}

	public String getDoctorGender() {
		return doctorGender;
	}

	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}

	public int getDoctorExperience() {
		return doctorExperience;
	}

	public void setDoctorExperience(int doctorExperience) {
		this.doctorExperience = doctorExperience;
	}

	public String getDoctorDepartment() {
		return doctorDepartment;
	}

	public void setDoctorDepartment(String doctorDepartment) {
		this.doctorDepartment = doctorDepartment;
	}

	public String getDoctorQualification() {
		return doctorQualification;
	}

	public void setDoctorQualification(String doctorQualification) {
		this.doctorQualification = doctorQualification;
	}

	public String getDoctorAddress() {
		return doctorAddress;
	}

	public void setDoctorAddress(String doctortAddress) {
		this.doctorAddress = doctortAddress;
	}

	public List<AppointmentEntity> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<AppointmentEntity> appointments) {
		this.appointments = appointments;
	}

	

}
