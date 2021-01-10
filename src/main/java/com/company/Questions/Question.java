package com.company.Questions;

import java.util.List;

public class Question {
    String content;
    List<String> answers;
    int rightAnswer;

    public Question(String content, List<String> answers, int rightAnswer) {
        this.content = content;
        this.answers = answers;
        this.rightAnswer = rightAnswer;
    }

    public String getContent() {
        return content;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public int getRightAnswer() {
        return rightAnswer;
    }

}
