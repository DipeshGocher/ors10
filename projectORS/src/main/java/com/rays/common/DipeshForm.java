package com.rays.common;

import javax.validation.constraints.NotEmpty;

public class DipeshForm extends BaseForm {

	@NotEmpty(message = "Required")
	private String diet;

	public String getDiet() {
		return diet;
	}

	public void setDiet(String diet) {
		this.diet = diet;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	@NotEmpty(message = "Required")
	private String food;

	@Override
	public BaseDTO getDto() {

		DipeshDTO dto = initDTO(new DipeshDTO());
		
		dto.setDiet(diet);
		dto.setFood(food);
		return dto;
	}

}
