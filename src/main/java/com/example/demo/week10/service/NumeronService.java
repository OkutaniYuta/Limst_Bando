package com.example.demo.week10.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class NumeronService {
    /**
     * <pre>
     *【問題文】
     * 下記の内容をフィールド変数として宣言してください
     * ＊以下の問題はここで宣言したものを使用します
     * ・答えの数列(answerList)
     * ・入力数列(attackList)
     * ・ターン数(turn) ターン数の初期値は0
     * </pre>
     */

    /**
     * <pre>
     *【問題文】
     * initメソッドを呼び出す引数無しのコンストラクタを定義してください
     * </pre>
     */
    public NumeronService() {
    }

    /**
     * <pre>
     *【問題文】
     *　initは、答えの数列(3桁)の値を格納したList型の値を返却するメソッドです。
     *　・答えの数列(3桁)の値を格納したList型の値を返却してください
     * ※返却に使用するList型は、先で定義したanswerListを用いてください
     * </pre>
     * @return answerList ランダム数値3桁が格納されるリスト(答えの数列)
     */
    public List<Integer> init() {
    }

    /**
     * <pre>
     *【問題文】
     * getAttackResultは引数のanswerlist(答えの数列)内の数値とattackNumber(String型の入力数値)が持つ数値の
     * 合致判定をするメソッドです。
     * ・合致判定処理を記載してください。
     * ※合致判定は数値List型同士(answerlist, attackList)で行ってください
     * ※attackNumberは3桁のString型数字のため、int型に変換のうえ定義済みのattackListに1桁ずつ格納してください。
     *  また、合致判定は
     *  数値・場所共にあっている判定(getHitCountメソッドの呼び出し)
     *  数値のみあっている判定(getBlowCountメソッドの呼び出し)を行い、
     *  判定結果をInteger型List、attackResultに格納してください。
     *  attackResultの0番目の要素にはhitResultの結果
     *  attackResultの1番目の要素にはblowResultの結果
     * </pre>
     * @param answerList ランダム数値3桁が格納されるリスト(答えの数列)
     * @param attackNumber  入力したString型の数字が格納される(入力数字)
     * @return attackResult
     */
    public List<Integer> getAttackResult(List<Integer> answerList, String attackNumber) {

        //attackListを初期化

        // attackNumberを1桁区切りにして、String型ListのnumberListに格納

        // String⇒intに変換のうえ、attackListに格納

        // hitResultにgetHitCount呼び出し結果を格納

        // String⇒intに変換のうえ、attackListに格納

        // hitResultにgetHitCount呼び出し結果を格納

        // blowResultにgetBlowCount呼び出し結果を格納

        // attackResultに判定結果を格納

    }

    /**
     * <pre>
     *【問題文】
     *　getHitCountは、引数のanswerlist(答えの数列)とattackList(入力数列)において、
     * 数値・場所共にあっている数字がいくつあるかを判定するメソッドです。
     * ・判定処理を記載してください。
     * ・判定結果(あっている数)をint型の変数hitCountを定義して格納してください。
     * </pre>
     * @param answerList 答えの数列
     * @param attackList 入力数列
     * @return hitCount 数値・場所共にあっている数
     */
    public int getHitCount(List<Integer> answerList, List<Integer> attackList) {
        // 数値と場所があっている場合の判定
    }

    /**
     * <pre>
     *【問題文】
     * getBlowCountは引数のanswerlist(答えの数列)とattackList(入力数列)において、
     * 場所は違うが、数値があっている数字がいくつあるかを判定するメソッドです。
     * ・判定処理を記載してください。
     * ・判定結果(あっている数)をint型の変数blowCountを定義して格納してください。
     * </pre>
     * @param answerList 答えの数列
     * @param attackList 入力数列
     * @return blowCount 数値のみあっている数
     */
    public int getBlowCount(List<Integer> answerList, List<Integer> attackList) {
        // 数値を使用しているが、場所があっていない場合の判定
    }

    /**
     * <pre>
     *【問題文】
     *　addturnは、アタック毎にターン数を経過させるメソッドです。
     * ・ターン数を経過させるメソッドを定義してください。
     * </pre>
     */
    public void addturn() {
    }

    /**
     * <pre>
     * 【問題文】
     *  getAnswerListはフィールド変数で宣言したanswerListを返却するメソッドです。
     * </pre>
     * @return answerList 答えのリスト
     */
    public List<Integer> getAnswerList() {
    }

    /**
     * <pre>
     * 【問題文】
     *  getTurnはフィールド変数で宣言したturnを返却するメソッドです。
     *  </pre>
     *  @return turn ターン数
     */
    public int getTurn() {
    }

    /**
     * <pre>
     *【問題文】
     * getRankは、引数のturn(経過ターン数)に応じて、称号を判定するメソッドです。
     * ・称号を判定する処理を記載してください。
     * ・判定結果はString型Listに格納して返却してください。
     *  rankの0番目の要素にはランクの結果
     *  rankの1番目の要素にはメッセージの結果
     * ※ターン数に応じた、ランク付け・メッセージは任意のモノを指定
     *  </pre>
     *  @param turn 経過ターン数
     *  @return rank　
     */
    public List<String> getRank(int turn) {
    }
}
