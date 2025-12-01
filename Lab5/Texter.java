package Lab5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Texter {
    public static int[] digits(String str) {
        int[] numbers = null;
        try {
            String content = new String(Files.readAllBytes(Paths.get(str)), "UTF-8");
            numbers = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            for (char c : content.toCharArray()) {
                if (Character.isDigit(c)) {
                    numbers[c - '0']++;
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return numbers;
    }
}

