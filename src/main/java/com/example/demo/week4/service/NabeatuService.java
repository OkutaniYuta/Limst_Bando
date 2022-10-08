package com.example.demo.week4.service;

import org.springframework.stereotype.Service;

@Service
public class NabeatuService {

    /**
     * <pre>
     * 【問題文】
     * getTotalNumは、1から引数のinputNumber(入力値)までの数値の和を計算するメソッドです。
     * ・1から入力値(inputNumber)までの数値の和を計算する処理を記載してください。
     * ・計算結果は変数totalNumに格納して、返却してください。
     * 例.
     * inputNumber=3
     * return 6
     * </pre>
     *
     * @param inputNumber 画面で入力した数字
     * @return totalNum 1から入力値(inputNumber)までの数値の和
     */
    public int getTotalNum(int inputNumber) {

    }
	
    /**
     * <pre>
     * 【問題文】
     * isAhoNumberは、引数のtotalNumがアホになる数値('3を含む数字'または'3の倍数')
     * かどうかを判定するメソッドです。
     * ・totalNumがアホになる数値('3を含む数字'または'3の倍数')かどうかを判定する処理を記述してください
     * ・なお、引数のtotalNumはメソッドgetTotalNumの計算結果が格納されています。
     * ・判別結果は変数flgに格納して返却してください。
     * ※アホになる数値の場合はtrue, アホにならない数値の場合はfalse
     * </pre>
     *
     * @param totalNum 1から入力値(inputNumber)までの数値の和
     * @return flg アホになる('3を含む数字'または'3の倍数')かどうかの結果
     */
    public boolean isAhoNumber(int totalNum) {

    }

}
