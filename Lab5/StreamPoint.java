package Lab5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPoint {
    public static Polyline processPoints(List<Point> points) {
        List<Point> processedPoints = points.stream()
                .distinct()
                .sorted(Comparator.comparingDouble(Point::getX))
                .map(point -> {
                    double newY = point.getY() < 0 ? -point.getY() : point.getY();
                    return new Point(point.getX(), newY);
                })
                .collect(Collectors.toList());
        return new Polyline(processedPoints);
    }
}
