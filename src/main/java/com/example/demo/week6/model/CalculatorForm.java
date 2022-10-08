package com.example.demo.week6.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class CalculatorForm {

	@NotNull
	@Max(1000000)
	@Min(1)
	private double firstNum;

	@NotNull
	@Max(1000000)
	@Min(1)
	private double secondNum;

	// 計算種別
	@NotNull
	private String calcType;

	// 計算種別名称
	private String physicalCalcType;


}
