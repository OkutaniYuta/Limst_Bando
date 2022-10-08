package com.example.demo.week6.service;

import java.util.LinkedHashMap;
import java.util.Map;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    /**
     * <pre>
     * 【問題文】
     *　getCalcTypeNameArrayは電卓で計算可能な演算子の和名一覧を返すメソッドです。
     *　・計算可能な演算子の和名一覧を定義してください。
     *　　演算子：足し算,引き算、掛け算、割り算
     *　・計算可能な演算子は配列calcTypeNameArrayに格納して返却してください。
     * </pre>
     *  @return calcTypeNameArray 演算子の配列
     */
	public String[] getCalcTypeNameArray() {

	}

    /**
     * <pre>
     * 【問題文】
     *　getCalcTypesは、選択可能な演算子を返却するメソッドです。
     * ・Mapを使用して、選択可能な演算子を定義して下さい。
     * ・なお、演算子のキーと値は下記の値を使用してください。
     *　   演算子選択：足し算(add),引き算(sub)、掛け算(mul)、割り算(div)
     *　      キー：add ⇒ 値：+ 
     *　      キー：sub ⇒ 値：-
     *　      キー：mul ⇒ 値：×
     *　      キー：div ⇒ 値：÷
     * ・演算子は、変数calcTypesに格納して返却してください。
     * </pre>
     *  @return calcTypes 演算子選択肢
     */
	public Map<String, String> getCalcTypes(){

	}

    /**
     * <pre>
     * 【問題文】
     *　convertPysicalCalcTypeは、引数のcalcTypeに対応する演算子の和名を取得するメソッドです。
     *　・引数のcalcTypeに対応する演算子の和名を取得する処理を記載してください。
     * ・演算子の和名の取得にはgetCalcTypeNameArrayで取得可能な配列を使用してください
     * ・演算子の和名は変数pysicalCalcTypeに格納して、返却してください。
     * </pre>
     *  @param calcType 画面で選択された計算方法に対応するgetCalcTypesのキー(英名)
     *  @return pysicalCalcType 選択演算子の和名
     */
	public String convertPysicalCalcType(String calcType) {

		//calcTypeNameArrayで宣言した、各演算子のインデックスを定義(定数)
		
		//pysicalCalcTypeの取得処理

	}

    /**
     * <pre>
     * 【問題文】
     *　calculateは、引数のcalcType(演算子の英名)に対応した計算メソッドを呼び出すメソッドです。
     *　・画面で選択可能な計算方法のそれぞれの計算メソッドを呼ぶ処理を記述してください。
     *　・それぞれの計算メソッドの結果は変数resultに格納して返却してください。
     * </pre>
     *  @param calcType 演算子の英名
     *  @param firstNum 1つ目に入力した数字
     *  @param secondNum 2つ目に入力した数字
     *  @return result 計算結果
     */
	public double calculate(String calcType,double firstNum,double secondNum) {

	}
    
	/**
     * <pre>
     * 【問題文】
     *　addは足し算を計算するメソッドです。
     *　・足し算の計算メソッドを定義してください。
     * </pre>
     *  @param firstNum 1つ目に入力した数字
     *  @param secondNum 2つ目に入力した数字
     *  @return result 計算結果
     */
	public double add(double firstNum , double secondNum) {

		// 結果格納用変数

	}

	/**
     * <pre>
     * 【問題文】
     *　subは引き算を計算するメソッドです。
     *　・引き算の計算メソッドを定義してください。
     * </pre>
     *  @param firstNum 1つ目に入力した数字
     *  @param secondNum 2つ目に入力した数字
     *  @return result 計算結果
     */
	public double sub(double firstNum , double secondNum) {

		// 結果格納用変数

	}

	/**
     * <pre>
     * 【問題文】
     *　mulは掛け算を計算するメソッドです。
     *　・掛け算の計算メソッドを定義してください。
     * </pre>
     *  @param firstNum 1つ目に入力した数字
     *  @param secondNum 2つ目に入力した数字
     *  @return result 計算結果
     */
	public double mul(double firstNum , double secondNum) {

		// 結果格納用変数

	}

	/**
     * <pre>
     * 【問題文】
     *　divは割り算を計算するメソッドです。
     *　・割り算の計算メソッドを定義してください。
     * </pre>
     *  @param firstNum 1つ目に入力した数字
     *  @param secondNum 2つ目に入力した数字
     *  @return result 計算結果
     */
	public double div(double firstNum , double secondNum) {

		// 結果格納用変数

	}
}
