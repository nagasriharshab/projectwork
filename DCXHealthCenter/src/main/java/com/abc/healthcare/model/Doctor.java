package com.abc.healthcare.model;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * @author NAGA SRI HARSHA
 *date : 05-July-2021
 */
public class Doctor {
	
	private int doctorID;

	@NotEmpty(message="please provide doctorname")
	private String doctorName;
	
	@NotEmpty(message="please provide username")
	private String doctorUserName;
	
	@NotEmpty(message="please provide password")
	private String doctorPassword;

	@NotEmpty(message="please provide email")
	@Email(message="email should be valid")
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

	/**
	 * getter for doctorId
	 * @return doctorId
	 */
	public int getDoctorID() {
		return doctorID;
	}

	/**
	 * setter for doctorId
	 * @param doctorID
	 */
	public void setDoctorID(int doctorID) {
		this.doctorID = doctorID;
	}

	/**
	 * getter for DoctorName
	 * @return doctorName
	 */
	public String getDoctorName() {
		return doctorName;
	}
	
	/**
	 * setter for doctorName
	 * @param doctorName
	 */
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	/**
	 * getter for DoctorUserName
	 * @return DoctorUserName
	 */
	public String getDoctorUserName() {
		return doctorUserName;
	}

	/**
	 * setter for DoctorUserName
	 * @param doctorUserName
	 */
	public void setDoctorUserName(String doctorUserName) {
		this.doctorUserName = doctorUserName;
	}

	/**
	 * getter for DoctorPassword
	 * @return DoctorPassword
	 */
	public String getDoctorPassword() {
		return doctorPassword;
	}

	/**
	 * setter for doctorPassword
	 * @param doctorPassword
	 */
	public void setDoctorPassword(String doctorPassword) {
		this.doctorPassword = doctorPassword;
	}

	/**
	 * getter for doctorEmail
	 * @return doctorEmail
	 */
	public String getDoctorEmail() {
		return doctorEmail;
	}

	/**
	 * setter for doctorEmail
	 * @param doctorEmail
	 */
	public void setDoctorEmail(String doctorEmail) {
		this.doctorEmail = doctorEmail;
	}

	/**
	 * getter for doctorContact
	 * @return doctorContact
	 */
	public long getDoctorContact() {
		return doctorContact;
	}

	/**
	 * setter for doctorContact
	 * @param doctorContact
	 */
	public void setDoctorContact(long doctorContact) {
		this.doctorContact = doctorContact;
	}

	/**
	 * getter for DoctorGender
	 * @return doctorGender
	 */
	public String getDoctorGender() {
		return doctorGender;
	}

	/**
	 * setter for DoctorGender
	 * @param doctorGender
	 */
	public void setDoctorGender(String doctorGender) {
		this.doctorGender = doctorGender;
	}
	
	/**
	 * getter for DoctorExperience in years
	 * @return DoctorExperience in years
	 */
	public int getDoctorExperience() {
		return doctorExperience;
	}

	/**
	 * setter for doctorExperience in years
	 *
	 * @param doctorExperience
	 */
	public void setDoctorExperience(int doctorExperience) {
		this.doctorExperience = doctorExperience;
	}

	/**
	 * getter for DoctorDepartment
	 * @return doctorDepartment
	 */
	public String getDoctorDepartment() {
		return doctorDepartment;
	}

	/**
	 * setter for doctorDepartment
	 * @param doctorDepartment
	 */
	public void setDoctorDepartment(String doctorDepartment) {
		this.doctorDepartment = doctorDepartment;
	}

	/**
	 * getter for doctorQualification
	 * @return doctorQualification
	 */
	public String getDoctorQualification() {
		return doctorQualification;
	}

	/**
	 * setter for doctorQualification
	 * @param doctorQualification
	 */
	public void setDoctorQualification(String doctorQualification) {
		this.doctorQualification = doctorQualification;
	}

	/**
	 * getter for DoctorAddress
	 * @return doctorAddress
	 */
	public String getDoctorAddress() {
		return doctorAddress;
	}

	/**
	 * setter for doctorAddress
	 * @param doctortAddress
	 */
	public void setDoctorAddress(String doctorAddress) {
		this.doctorAddress = doctorAddress;
	}
	
}
