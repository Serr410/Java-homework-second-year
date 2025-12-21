package Lab6.Two;

@Two(first = "Data sample", second = 0)
public class TwoClass {
    private String name;
    private int value;

    public TwoClass(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void display() {
        System.out.println("Name: " + name + ", Value: " + value);
    }
}