package com.cts.processPension.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Data to be stored in the database
 * 
 *  @author Sarika Soni
 *  @author 890071
 *
 */
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@Entity
public class PensionAmountDetail {

	

	@Id
	private String aadhaarNumber;

	@Column
	private Double pensionAmount;

	@Column
	private Double bankServiceCharge;

	@Column
	private Double finalAmount;

	public String getAadhaarNumber() {
		return aadhaarNumber;
	}

	public void setAadhaarNumber(String aadhaarNumber) {
		this.aadhaarNumber = aadhaarNumber;
	}

	public Double getPensionAmount() {
		return pensionAmount;
	}

	public void setPensionAmount(Double pensionAmount) {
		this.pensionAmount = pensionAmount;
	}

	public Double getBankServiceCharge() {
		return bankServiceCharge;
	}

	public void setBankServiceCharge(Double bankServiceCharge) {
		this.bankServiceCharge = bankServiceCharge;
	}

	public Double getFinalAmount() {
		return finalAmount;
	}

	public void setFinalAmount(Double finalAmount) {
		this.finalAmount = finalAmount;
	}
	
	
}
