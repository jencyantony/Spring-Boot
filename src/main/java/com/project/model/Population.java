package com.project.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "population")
public class Population {

	@Id
	@Column(name= "population_id", updatable = false, unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int populationId;
	
	@Column(name= "recepient_Id", updatable = false, nullable = false)
	private int recepientId;

	@Column(name= "first_name", updatable = true, nullable = false)
	private String firstName;

	@Column(name= "last_name", updatable = true, nullable = false)
	private String lastName;

	@Column(name= "start_date", updatable = true, nullable = false)
	private Date startDate;

	@Column(name= "end_date", updatable = true, nullable = false)
	private Date endDate;

	@Column(name= "programme_name", updatable = true, nullable = false)
	private String programmeName;

	@Column(name= "address_line1", updatable = true, nullable = false)
	private String addressLine1;

	@Column(name= "address_line2", updatable = true, nullable = false)
	private String addressLine2;

	@Column(name= "city", updatable = true, nullable = false)
	private String city;

	@Column(name= "state", updatable = true, nullable = false)
	private String state;

	@Column(name= "zip_code", updatable = true, nullable = false)
	private String zipCode;

	@Column(name= "dob", nullable = false, updatable = false)
	private Date dob;

	@Column(name= "pcp_name", nullable = false)
	private String pcpName;

	@Column(name= "pcp_npi", nullable = false)
	private String pcpNpi;

	public int getPopulationId() {
		return populationId;
	}

	public void setPopulationId(int populationId) {
		this.populationId = populationId;
	}

	public int getRecepientId() {
		return recepientId;
	}

	public void setRecepientId(int recepientId) {
		this.recepientId = recepientId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getProgrammeName() {
		return programmeName;
	}

	public void setProgrammeName(String programmeName) {
		this.programmeName = programmeName;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPcpName() {
		return pcpName;
	}

	public void setPcpName(String pcpName) {
		this.pcpName = pcpName;
	}

	public String getPcpNpi() {
		return pcpNpi;
	}

	public void setPcpNpi(String pcpNpi) {
		this.pcpNpi = pcpNpi;
	}

}
