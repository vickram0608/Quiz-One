package util;

import java.util.HashSet;
import java.util.Set;

public class Utility {

    public int[] getRandomNumbers(int min, int max, int count) {
        int[] randomNums = new int[count];
        Set<Integer> usedQuestionNum = new HashSet<>(count);
        int idx = -1;
        do {
            int num = (int) (Math.random() * (max - min + 1) + min);
            if (usedQuestionNum.contains(num)) {
                continue;
            }
            randomNums[++idx] = num;
        } while (idx < count - 1);
        return randomNums;
    }

}
