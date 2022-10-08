package com.example.demo.week2.service;

import org.springframework.stereotype.Service;

@Service
public class TaxService {

    // 税率(10%)
    final private double TAX_RATE = 0.1;

    /**
     * <pre>
     * 【問題文】
     *  getTaxCalcResultは引数のpriceWithoutTax(税抜き金額)を用いて、
     *  税込み金額を計算するメソッドです。
     *   ・税込金額を計算する処理を記載してしてください。
     *   ・定数で宣言している税率を用いてください。
     *   ・税込計算結果はtaxCalcResultに格納して返却してください
     * </pre>
     *
     * @param priceWithoutTax 税抜き金額
     * @return taxCalcResult 税込計算結果
     */
    public double getTaxCalcResult(int priceWithoutTax) {

    }

    /**
     * <pre>
     * 【問題文】
     *  getTaxRateは税率を返すメソッドです。
     *   ・定数として宣言している税率を返却してください
     * </pre>
     *
     * @return 税率
     */
    public double getTaxRate() {

    }
}
