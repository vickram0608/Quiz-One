package service;

import dto.Option;
import dto.Question;
import util.Utility;

public class QuestionService {

    private final Utility utility;

    public QuestionService() {
        utility = new Utility();
    }

    /**
     * This method returns a set of questions for the quiz.
     * 
     * @return Question[] - An array of questions.
     */
    public Question[] getQuestionSet() {
        Question[] questionSet = new Question[QUESTION_COUNT];

        int[] randomNums = utility.getRandomNumbers(0, questionBank.length - 1, QUESTION_COUNT);
        for (int i = 0; i < QUESTION_COUNT; i++) {
            questionSet[i] = questionBank[randomNums[i]];
        }
        return questionSet;
    }

    public int getQuestionCount() {
        return QUESTION_COUNT;
    }

    // This property controls the number of questions in a given quiz.
    private static final int QUESTION_COUNT = 5;

    private static Question[] questionBank;

    static {
        loadQuestionBank();
    }

    /**
     * This method populates the questionBank array with multiple questions, which
     * can be picked up later to prepare question set for the quiz.
     */
    private static void loadQuestionBank() {
        questionBank = new Question[10];

        // Question 1
        Option option1_1 = new Option('A', "Punjab National Bank");
        Option option1_2 = new Option('B', "Indian Bank");
        Option option1_3 = new Option('C', "Bank of Baroda");
        Option option1_4 = new Option('D', "Dena Bank");
        Option[] options1 = { option1_1, option1_2, option1_3, option1_4 };
        questionBank[0] = new Question(1,
                "Which of the three banks will be merged with the other two to create India’s third-largest bank?",
                options1, 'B');

        // Question 2
        Option option2_1 = new Option('A', "Seismic");
        Option option2_2 = new Option('B', "Cosmic");
        Option option2_3 = new Option('C', "Formic");
        Option option2_4 = new Option('D', "Anaemic");
        Option[] options2 = { option2_1, option2_2, option2_3, option2_4 };
        questionBank[1] = new Question(2, "What is the name of the weak zone of the earth’s crust?", options2, 'A');

        // Question 3
        Option option3_1 = new Option('A', "Delhi");
        Option option3_2 = new Option('B', "Hyderabad");
        Option option3_3 = new Option('C', "Rajasthan");
        Option option3_4 = new Option('D', "Mumbai");
        Option[] options3 = { option3_1, option3_2, option3_3, option3_4 };
        questionBank[2] = new Question(3, "Where was India’s first national Museum opened?", options3, 'D');

        // Question 4
        Option option4_1 = new Option('A', "Lata Mangeshkar");
        Option option4_2 = new Option('B', "Asha Bhosle");
        Option option4_3 = new Option('C', "Bhupen Hazarika");
        Option option4_4 = new Option('D', "Manna Dey");
        Option[] options4 = { option4_1, option4_2, option4_3, option4_4 };
        questionBank[3] = new Question(4, "In 2019, Which popular singer was awarded the Bharat Ratna award?", options4,
                'C');

        // Question 5
        Option option5_1 = new Option('A', "Japan");
        Option option5_2 = new Option('B', "Asia");
        Option option5_3 = new Option('C', "South Korea");
        Option option5_4 = new Option('D', "Malaysia");
        Option[] options5 = { option5_1, option5_2, option5_3, option5_4 };
        questionBank[4] = new Question(5, "The world’s nation 5G mobile network was launched by which country?",
                options5, 'C');

        // Question 6
        Option option6_1 = new Option('A', "2017");
        Option option6_2 = new Option('B', "2015");
        Option option6_3 = new Option('C', "2019");
        Option option6_4 = new Option('D', "2020");
        Option[] options6 = { option6_1, option6_2, option6_3, option6_4 };
        questionBank[5] = new Question(6, "When was Pravasi Bhartiya Divas held in Varanasi?", options6, 'C');

        // Question 7
        Option option7_1 = new Option('A', "UK");
        Option option7_2 = new Option('B', "USA");
        Option option7_3 = new Option('C', "India");
        Option option7_4 = new Option('D', "Fiji");
        Option[] options7 = { option7_1, option7_2, option7_3, option7_4 };
        questionBank[6] = new Question(7, "Vijay Singh (golf player) is from which country?", options7, 'D');

        // Question 8
        Option option8_1 = new Option('A', "Differential Research and Documentation Laboratory");
        Option option8_2 = new Option('B', "Department of Research and Development Laboratory");
        Option option8_3 = new Option('C', "Defense Research and Development Laboratory");
        Option option8_4 = new Option('D', "None of the above");
        Option[] options8 = { option8_1, option8_2, option8_3, option8_4 };
        questionBank[7] = new Question(8, "What is the full form of DRDL?", options8, 'B');

        // Question 9
        Option option9_1 = new Option('A', "Mars");
        Option option9_2 = new Option('B', "Uranus");
        Option option9_3 = new Option('C', "Venus");
        Option option9_4 = new Option('D', "Earth");
        Option[] options9 = { option9_1, option9_2, option9_3, option9_4 };
        questionBank[8] = new Question(9, "The green planet in the solar system is?", options9, 'B');

        // Question 10
        Option option10_1 = new Option('A', "Dr Homi Bhabha");
        Option option10_2 = new Option('B', "Dr Chidambaram");
        Option option10_3 = new Option('C', "Dr U.R. Rao");
        Option option10_4 = new Option('D', "Dr A.P.J. Abdul Kalam");
        Option[] options10 = { option10_1, option10_2, option10_3, option10_4 };
        questionBank[9] = new Question(10, "The father of Indian missile technology is _________________?", options10,
                'D');
    }
}
