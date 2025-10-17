package Lab2;

import java.util.HashMap;
import java.util.Map;

public class City {
    private String name;
    private HashMap<City, Integer> routes; // Город -> стоимость

    public City(String name) {
        this.name = name;
        this.routes = new HashMap<>();
    }

    public void addRoute(City dest, int cost) {
        routes.put(dest, cost);
    }
    public String getName() {
        return name;
    }
    public Map<City, Integer> getRoutes() {
        return routes;
    }

    @Override
    public String toString() {
        String data = "City: " + this.name + "\n";

        for (HashMap.Entry<City, Integer> entry : routes.entrySet()) {
            data = data + entry.getKey().getName() + entry.getValue() + "\n";
        }
        return data;
    }
}