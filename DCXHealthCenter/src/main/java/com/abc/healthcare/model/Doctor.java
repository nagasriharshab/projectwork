package com.abc.healthcare.model;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Doctor {
	
	@NotNull(message = "please provide id")
	private int doctorID;

	@NotEmpty(message="please provide doctorname")
	private String doctorName;
	
	@NotEmpty(message="please provide username")
	private String doctorUserName;
	
	@NotEmpty(message="please provide password")
	private String doctorPassword;

	@NotEmpty(message="please provide email")
	private  String doctorEmail;

	@NotNull(message="please provide contact")
	private long doctorContact;

	@NotEmpty(message="please provide gender")
	private String doctorGender;

	@NotNull(message="please provide experience")
	private int doctorExperience;

	@NotEmpty(message="please provide department")
	private String doctorDepartment;

	@NotEmpty(message="please provide qualification")
	private String doctorQualification;
	
	@NotEmpty(message="please provide address")
	private String doctorAddress;

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

	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}
	
}
