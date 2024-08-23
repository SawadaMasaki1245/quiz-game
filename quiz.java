package quiz;

import java.util.List;

public class Quiz {
    private int quizNumber;
    private String mainText;
    private List<Choice> choices;
    private int answer;
    public Quiz(int quizNumber, String mainText, List<Choice> choices, int answer) {
        this.quizNumber = quizNumber;
        this.mainText = mainText;
        this.choices = choices;
        this.answer = answer;
    }
    // クイズの表示機能
    public void showQuiz() {
        // クイズ番号を表示
        System.out.println("[問題" + this.quizNumber + "]");
        // クイズの本文を表示
        System.out.println(this.mainText);
        // 選択肢を表示
        for (Choice choice : choices) {
            System.out.println(choice.getIndex() + "." + choice.getText());
        }
        // ユーザーに回答を促す
        System.out.print("こたえを入力してください>");
    }
    public boolean isCorrect(int givenAnswer) {
        return givenAnswer == this.answer;
    }
}
