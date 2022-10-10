package com.example.demo.week3.service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service

public class OmikujiService {
    /**
     * <pre>
     * 【問題文】
     * getResultはおみくじを引いた結果を取得するメソッドです。
     * ・ランダムなおみくじの結果を取得する処理を記載してください。
     * ・おみくじの結果は変数resultに格納して返却してください 例.大吉
     * </pre>
     *
     * @return result おみくじの結果
     */
    public String getResult() {
    	Random random = new Random();
    	int n = random.nextInt(4);
    	
    	String result = "";
    	if (n == 0) {
    		result = "大吉";
    	} else if (n == 1) {
    		result = "中吉";
    	} else if (n ==2) {
    		result = "吉";
    	} else {
    		result = "凶";
    	}
    	return result;
    }

    /**
     * <pre>
     * 【問題文】
     * getResultCommentは引数のresult(おみくじの結果)に紐づいた、コメントを返すメソッドです。
     * ・result(おみくじの結果)に紐づいた、コメントを取得する処理を記載してください。
     * ・コメントはresultCommentに格納して返却してください 例.大吉です、今日はとても良い日でしょう
     * ・条件分岐は引数で渡している'result'を用いてください
     * ※なお、引数のresultはgetResultメソッドで取得した結果が格納されています。
     * </pre>
     *
     * @param result おみくじの結果
     * @return resultComment おみくじ結果に対してのコメント
     */
    
    public String getResultComment(String result) {
    	
    	
        //おみくじの結果に紐づいた、コメントを定数として定義
    	String resultComment = "";
    	if (result == "大吉") {
    		resultComment = "大吉です。おめでとうございます！";
    	} else if (result == "中吉") {
    		resultComment = "中吉です。よかったです。";
    	} else if (result == "吉") {
    		resultComment = "吉です。まあまあです。";
    	} else {
    		resultComment = "凶です。残念です。";
    	}
    	return resultComment;
    }
  }

    
