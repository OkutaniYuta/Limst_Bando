package com.example.demo.week2.model;

import lombok.Data;

//BMI計算結果格納用Model

@Data
public class BmiResultModel {

	private double height;

	private double weight;

	private double bmi;

	private String obesity;

}
