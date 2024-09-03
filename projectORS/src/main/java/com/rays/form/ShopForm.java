package com.rays.form;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.ShopDTO;

public class ShopForm  extends BaseForm{
	
	@NotEmpty(message = "please enter catagory here")
	private String catagory;
	
	@NotNull(message = "please enter price here")
	@Min(value = 1, message = "enter price here")
	@Max(value = 99999, message = "price should have only 5 digits")
	private long price;
	
	@NotNull(message = "please enter mfd date here")
	@PastOrPresent(message = "date must be in past or present")
	private Date mfd;
	
	
	@NotEmpty(message = "please enter size")
	private String size;
	
	@NotEmpty(message = "please enter brand")
	private String brand;

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
	 @Override
	public BaseDTO getDto() {
		 ShopDTO dto = initDTO(new ShopDTO());
		 dto.setCatagory(catagory);
		 dto.setPrice(price);
		 dto.setMfd(mfd);
		 dto.setBrand(brand);
		 dto.setSize(size);
		return dto;
	}
	

}
