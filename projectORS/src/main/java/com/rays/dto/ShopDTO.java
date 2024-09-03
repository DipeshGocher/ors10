package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_SHOP")
public class ShopDTO extends BaseDTO {
	
	@Column(name = "CATAGORY", length = 100)
	private String catagory;
	
	@Column(name = "PRICE")
	private long price; 
	
	@Column(name = "MFD")
	private Date mfd;
	
	@Column(name = "SIZE", length = 50)
	private String size;
	
	@Column(name = "BRAND", length = 50)
	private String brand;
	
	@Column(name = "ORG_NAME")
	private String orgName;
	
	
	public String getCatagory() {
		return catagory;
	}
	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Date getMfd() {
		return mfd;
	}
	public void setMfd(Date mfd) {
		this.mfd = mfd;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	@Override
	public String getValue() {
		return null;
	}
	@Override
	public String getUniqueKey() {
		return "brand";
	}
	@Override
	public String getUniqueValue() {
		// TODO Auto-generated method stub
		return id + "";
	}
	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return "Shop";
	}
	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("catagory", "asc");
		return map;
	}
	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map1 = new LinkedHashMap<>();
		map1.put("id", id);
		return map1;
	}
	
	
	
	
	
	
	
	
	

}
