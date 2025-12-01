package Lab5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamName {
    public static Map<Integer, List<String>> processFile(String filename) throws IOException {
        return Files.lines(Paths.get(filename))
                .filter(line -> !line.trim().isEmpty())
                .map(line -> line.split(":"))
                .filter(parts -> parts.length == 2 && !parts[1].trim().isEmpty())
                .map(parts -> Map.entry(
                        formatName(parts[0].trim()),
                        Integer.parseInt(parts[1].trim())
                ))
                .collect(Collectors.groupingBy(
                        Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())
                ));
    }
    private static String formatName(String name) {
        if (name == null || name.isEmpty()) {
            return name;
        }
        return name.substring(0, 1).toUpperCase() +
                name.substring(1).toLowerCase();
    }
}
