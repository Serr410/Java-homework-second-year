package Lab5;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import static Lab5.StreamName.processFile;

public class NameTester {
    public static void tester(String str) {
        try {
            Map<Integer, List<String>> result = processFile(str);

            System.out.println("Result:");
            result.entrySet().stream()
                    .sorted(Map.Entry.comparingByKey())
                    .forEach(entry ->
                            System.out.println(entry.getKey() + ": " + entry.getValue())
                    );
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
