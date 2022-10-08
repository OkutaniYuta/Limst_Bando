package com.example.demo.week4.formobject;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class NabeatuForm {
	
	@NotNull
	@Min(1)
	@Max(1000)
	private int number;

}