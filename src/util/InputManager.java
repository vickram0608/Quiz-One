package util;

import java.util.Scanner;

public class InputManager {
    private static final Scanner scanner = new Scanner(System.in);

    public static Scanner getScanner() {
        return scanner;
    }

    public static void closeScanner() {
        if (scanner != null) {
            scanner.close();
        }
    }
}
