package com.example.demo.week5.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;

// homeの入力値に対応するModel
@Data
public class CalcForm {
	
	@NotNull
	@Min(1)
	@Max(10000)
	private int principal;//元金

	@NotNull
	@Min(0)
	@Max(100)
	private double rate;//金利
	
	@NotNull
	@Min(1)
	@Max(100)
	private int years;//経過年数
	
}
