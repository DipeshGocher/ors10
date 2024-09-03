package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_COMPENSATION")
public class CompensationDTO extends BaseDTO {

	@Column(name = "STAFF_MEMBER", length = 100)
	private String staffMember;

	@Column(name = "PAYMENT_AMOUNT")
	private Integer paymentAmount;

	@Column(name = "DATE_APPLIED")
	private Date dateApplied;

	@Column(name = "STATE", length = 50)
	private String state;

	public String getStaffMember() {
		return staffMember;
	}

	public void setStaffMember(String staffMember) {
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
	public String getValue() {
		return null;
	}

	@Override
	public String getUniqueKey() {
		return "state";
	}

	@Override
	public String getUniqueValue() {
		return id + "";
	}

	@Override
	public String getLabel() {
		return "Compensation";
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("staffMember", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		map.put("id", id);
		return map;
	}

}
