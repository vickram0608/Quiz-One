import java.util.Scanner;

import service.ParticipantService;
import util.InputManager;

class QuizMasterOne {

    private static final String EXIT_CODE = "XXX";

    public static void main(String[] args) {
        String participantName;
        Scanner scanner = InputManager.getScanner();

        do {
            System.out.print("Please enter your name: ");
            participantName = scanner.nextLine();

            if (participantName.length() == 0 || participantName.length() > 50) {
                System.out.println("\n Invalid name entered, pls try again!");
                System.out.println("You may exit the quiz by typing: " + EXIT_CODE);
            }
            if (participantName.equalsIgnoreCase(EXIT_CODE)) {
                return;
            }
        } while (participantName.length() == 0);

        new ParticipantService(participantName).startQuiz();

        InputManager.closeScanner();
    }
}