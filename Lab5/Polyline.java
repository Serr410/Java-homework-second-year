package Lab5;

import java.util.ArrayList;
import java.util.List;

public class Polyline {
    private final List<Point> points;

    public Polyline(List<Point> points) {
        this.points = new ArrayList<>(points);
    }

    public List<Point> getPoints() {
        return new ArrayList<>(points);
    }

    @Override
    public String toString() {
        return "Line " + points;
    }
}
