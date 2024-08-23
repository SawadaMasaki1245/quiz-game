package quiz;



import java.util.*;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        // クイズのリストを作成
        List<Quiz> quizzes = new ArrayList<Quiz>();

        // クイズ1の選択肢を設定
        List<Choice> q1Choices = new ArrayList<Choice>();
        q1Choices.add(new Choice(1, "食パン"));
        q1Choices.add(new Choice(2, "あんパン"));
        q1Choices.add(new Choice(3, "フライパン"));
        // クイズ1をリストに追加
        quizzes.add(new Quiz(1, "パンはパンでも食べられないパンは?", q1Choices, 3));

        // クイズ2の選択肢を設定
        List<Choice> q2Choices = new ArrayList<Choice>();
        q2Choices.add(new Choice(1, "近畿地方"));
        q2Choices.add(new Choice(2, "関東地方"));
        q2Choices.add(new Choice(3, "九州地方"));
        // クイズ2をリストに追加
        quizzes.add(new Quiz(2, "群馬県は何地方?", q2Choices, 2));

        // クイズ3の選択肢を設定
        List<Choice> q3Choices = new ArrayList<Choice>();
        q3Choices.add(new Choice(1, "1960年"));
        q3Choices.add(new Choice(2, "1940年"));
        q3Choices.add(new Choice(3, "1964年"));
        // クイズ3をリストに追加
        quizzes.add(new Quiz(3, "最初の東京オリンピックは何年?", q3Choices, 3));

        // プレイヤーオブジェクトの作成
        Player player = new Player();

        // 以下、ゲームの進行部分...
    }
}

