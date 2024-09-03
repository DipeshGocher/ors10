package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.CompensationDTO;

public class CompensationForm extends BaseForm{
	
	
	@NotEmpty(message = "please select a staffmember")
	//@Pattern(regexp = "^[1-4]$", message = "staff members must be 1 , 2 or 3")
	private String staffMember;
	
	@NotNull(message = "please select payment Amount")
	@Min(value = 1, message = "payment amount should be more than 1")
	@Max(value = 999999999, message = "payment amount should have only 9 digits")
	private Integer paymentAmount;
	
	@NotNull(message = "please select apply date")
	@PastOrPresent(message = "date applied  must be in past or present")
	private Date dateApplied;
	
	@NotEmpty(message = "please select state")
	//@Pattern(regexp = "^[1-2]$", message = "state must be 1 or 2")
	private String state;
	
	public String getStaffMember() {
		return staffMember;
	}

	public void setStaffMemeber(String staffMember) {
		this.staffMember = staffMember;
	}

	public Integer getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(Integer paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public Date getDateApplied() {
		return dateApplied;
	}

	public void setDateApplied(Date dateApplied) {
		this.dateApplied = dateApplied;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public BaseDTO getDto() {
		CompensationDTO dto = initDTO(new CompensationDTO());
		dto.setStaffMember(staffMember);
		dto.setPaymentAmount(paymentAmount);
		dto.setDateApplied(dateApplied);
		dto.setState(state);		
		return dto;
	}
	

}
