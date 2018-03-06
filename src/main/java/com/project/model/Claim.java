package com.project.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "claims")
public class Claim {

	@Id
	@Column(name= "claims_id", updatable = false, unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int claimId;
	
	@Column(name= "recipient_id", updatable = false, unique = true, nullable = false)
	private int recepientId;
	
	@Column(name= "notes", updatable = true, nullable = false)
	private String notes;
	
	@Column(name= "amountCharged", updatable = true, nullable = false)
	private int amountCharged;
	
	@Column(name= "amountPaid", updatable = true, nullable = false)
	private int amountPaid;
	
	@Column(name= "primaryDiagnosisCode", updatable = false, nullable = false)
	private String primaryDiagnosisCode;
	
	@Column(name= "primaryProcedureCode", updatable = false, nullable = false)
	private String primaryProcedureCode;
	
	@Column(name= "pcpName", updatable = false, nullable = false)
	private String pcpName;
	
	@Column(name= "pcpNpi", updatable = false, nullable = false)
	private String pcpNpi;
	
	@Column(name= "serviceDate", updatable = true, nullable = false)
	private Date serviceDate;
	
	@Column(name= "claimSubmissionDate", updatable = true, nullable = false)
	private Date claimSubmissionDate;
	
	public int getRecepientId() {
		return recepientId;
	}
	public void setRecepientId(int recepientId) {
		this.recepientId = recepientId;
	}
	public int getClaimId() {
		return claimId;
	}
	public void setClaimId(int claimId) {
		this.claimId = claimId;
	}
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public int getAmountCharged() {
		return amountCharged;
	}
	public void setAmountCharged(int amountCharged) {
		this.amountCharged = amountCharged;
	}
	public int getAmountPaid() {
		return amountPaid;
	}
	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}
	public String getPrimaryDiagnosisCode() {
		return primaryDiagnosisCode;
	}
	public void setPrimaryDiagnosisCode(String primaryDiagnosisCode) {
		this.primaryDiagnosisCode = primaryDiagnosisCode;
	}
	public String getPrimaryProcedureCode() {
		return primaryProcedureCode;
	}
	public void setPrimaryProcedureCode(String primaryProcedureCode) {
		this.primaryProcedureCode = primaryProcedureCode;
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
	public Date getServiceDate() {
		return serviceDate;
	}
	public void setServiceDate(Date serviceDate) {
		this.serviceDate = serviceDate;
	}
	public Date getClaimSubmissionDate() {
		return claimSubmissionDate;
	}
	public void setClaimSubmissionDate(Date claimSubmissionDate) {
		this.claimSubmissionDate = claimSubmissionDate;
	}

}
