package service;

import java.util.Map;

import dto.Question;

public class ResultService {

    /**
     * The evaluateResult method calculates score for a given quiz
     * 
     * @param questionAnswerSet
     * @return
     */
    public Integer evaluateResult(final Map<Question, Character> questionAnswerSet) {
        int score = 0;

        for (Map.Entry<Question, Character> quesAns : questionAnswerSet.entrySet()) {
            char correctOption = Character.toUpperCase(quesAns.getKey().getCorrectOption());
            char selectedOption = Character.toUpperCase(quesAns.getValue());

            if (selectedOption == correctOption) {
                score++;
            }
        }

        return score;
    }

}
