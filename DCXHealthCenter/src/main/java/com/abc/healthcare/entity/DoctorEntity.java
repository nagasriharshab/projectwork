package com.abc.healthcare.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * @author NAGA SRI HARSHA
 *date : 05-July-2021
 */
@Entity
@Table(name="doctor_tbl")
public class DoctorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	/**
	 * getter for AppointmentList
	 * @return Appointmentlist
	 */
	public List<AppointmentEntity> getAppointments() {
		return appointments;
	}

	/**
	 * setter for appointmentlist
	 * @param appointments
	 */
	public void setAppointments(List<AppointmentEntity> appointments) {
		this.appointments = appointments;
	}

	

}
