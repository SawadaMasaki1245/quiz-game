package quiz;

public class Player {
    private int correctQuizNum; // 正答数を格納するための属性

    public Player() {
        this.correctQuizNum = 0; // コンストラクタで初期化
    }

    public void showCorrectQuizNum() {
        // TODO:実装する。
        System.out.println("正答数:" + this.correctQuizNum); // 正答数を表示するメソッド
    }

    public void setCorrectQuizNum(int correctQuizNum) {
        this.correctQuizNum = correctQuizNum; // 正答数を設定するメソッド
    }

    public int getCorrectQuizNum() {
        return this.correctQuizNum; // 正答数を取得するメソッド
    }
}
