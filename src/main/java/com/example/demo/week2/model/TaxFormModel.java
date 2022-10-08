package com.example.demo.week2.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class TaxFormModel {

	// 税抜き金額
	@NotNull
	@Min(1)
	private int priceWithoutTax;

}
