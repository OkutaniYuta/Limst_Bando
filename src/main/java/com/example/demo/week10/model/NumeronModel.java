package com.example.demo.week10.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

// indexの入力値に対応するModel

@Data
public class NumeronModel {
	@NotNull
	@Size(min=3,max=3)
	@Min(0)
    private String attackNumber;//予想数値

}
