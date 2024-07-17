package service;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import dto.Option;
import dto.Question;
import util.InputManager;

public class ParticipantService {
    private final String participantName;
    private static final QuestionService questionService = new QuestionService();
    private static final ResultService resultService = new ResultService();
    private static final int QUESTION_COUNT;

    static {
        QUESTION_COUNT = questionService.getQuestionCount();
    }

    public ParticipantService(String participantName) {
        this.participantName = participantName;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void startQuiz() {
        System.out.println("*** Welcome to the Quiz, " + participantName + "! ***\n");

        // Get QuestionSet
        Question[] questionSet = questionService.getQuestionSet();

        // Ask Questions
        Map<Question, Character> questionAnswers = askQuestions(questionSet);

        // Evaluate & Display Result
        int score = resultService.evaluateResult(questionAnswers);
        System.out.println(participantName + ", you have scored " + score + "/" + QUESTION_COUNT);
    }

    private Map<Question, Character> askQuestions(Question[] questionSet) {
        Map<Question, Character> quesAnswerMap = new HashMap<Question, Character>(QUESTION_COUNT);
        final char EMPTY_CHAR_VAL = '\u0000';
        Scanner scanner = InputManager.getScanner();

        for (Question question : questionSet) {
            System.out.println("Question " + question.getId() + ": ");
            System.out.println(question.getQuestion());

            for (Option option : question.getOptions()) {
                System.out.println(option.getSelector() + ". " + option.getText());
            }

            char selectedAnswer = EMPTY_CHAR_VAL;
            do {
                System.out.print("Your Answer: ");
                String response = scanner.nextLine();
                if (response.length() != 1) {
                    System.out.println("Invalid Response. Pls try again...");
                    continue;
                }
                selectedAnswer = response.charAt(0);
            } while (selectedAnswer == EMPTY_CHAR_VAL);

            quesAnswerMap.put(question, selectedAnswer);
        }

        return quesAnswerMap;
    }

}
