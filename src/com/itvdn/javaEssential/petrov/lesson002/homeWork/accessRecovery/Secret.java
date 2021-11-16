package com.itvdn.javaEssential.petrov.lesson002.homeWork.accessRecovery;

public class Secret {
    private String question;
    private String answer;

    public Secret(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public boolean checkQuestion(String question) {
        return !this.question.equals("") &&
                !this.question.equals(Storage.NOT) &&
                this.question.equals(question);
    }

    public boolean checkAnswer(String answer) {
        return !this.answer.equals("") &&
                !this.answer.equals(Storage.NOT)
                && this.answer.equals(answer);
    }

    public int getPercent(String question, String answer) {
        return (this.checkQuestion(question) ? Storage.SECRET_QUESTION_PERCENT : Storage.ZERO) +
                (this.checkAnswer(answer) ? Storage.SECRET_ANSWER_PERCENT : Storage.ZERO);
    }
}
