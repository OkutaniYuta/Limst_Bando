package com.example.demo.week4.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class EndlessOmikujiService {
    /**
     * <pre>
     * 【問題文】
     * getResultはおみくじを引いた結果が"凶"になるまで繰り返しおみくじを引き続けるメソッドです。
     * ・ランダムなおみくじの結果を取得する処理を記載してください。
     * ・おみくじの結果が凶になるまで、繰り返しおみくじの結果を取得してください。
     * ・おみくじの結果は変数resultに格納して返却してください。 例.凶
     * なお、
     * </pre>
     *
     * @return result おみくじの結果
     */
    public String getResult() {
    	Random random = new Random();   	
    	String result = " ";
    	while (result != "凶") {
    		int n = random.nextInt(4);
        	if (n == 0) {
        		result = "大吉";
        	} else if (n == 1) {
        		result = "中吉";
        	} else if (n ==2) {
        		result = "吉";
        	} else {
        		result = "凶";
        		break;
        	}
    	}
    return result;
    }
    
    

    /**
     * <pre>
     * 【問題文】
     * getResultCommentは引数のresult(おみくじの結果)に紐づいた、コメントを返すメソッドです。
     * ・無限おみくじの仕様に沿ったコメントを取得する記述をしてください。
     * ・コメントはresultCommentに格納して返却してください。 例.凶です、今あなたの後ろに・・・
     * ※なお、引数のresultはメソッドgetResultで取得した結果が格納されています。
     * </pre>
     *
     * @return resultComment 無限おみくじの仕様に沿ったコメント
     */
    public String getResultComment() {
    	String result = " ";
    	String resultComment = "";
    	if (result.equals("大吉")) {
    		resultComment = "大吉です。おめでとうございます！";
    		return resultComment;
    	} else if (result == "中吉") {
    		resultComment = "中吉です。よかったです。";
    		return resultComment;
    	} else if (result == "吉") {
    		resultComment = "吉です。まあまあです。";
    		return resultComment;
    	} else {
    		resultComment = "凶です。残念です。";
    		return resultComment;
    	}
    }
}
 
