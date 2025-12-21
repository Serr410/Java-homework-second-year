package Lab6.Annot;

public class AnnotClass {
    private String name;
    private int counter;

    public AnnotClass(String name) {
        this.name = name;
        this.counter = 0;
    }

    public String getName() {
        return name;
    }

    public int getCounter() {
        return counter;
    }

    public void plusOne() {
        this.counter ++;
    }

    @Invoke
    public void Namor() {
        this.name = "Namor%s".formatted(this.counter);
    }

    @Invoke
    public void plusTwo() {
        this.counter = this.counter + 2;
    }
}
