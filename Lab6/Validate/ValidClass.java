package Lab6.Validate;

@Validate({String.class, Integer.class, Double.class})
public class ValidClass {
    private String data;
    private int count;
    private double value;

    public ValidClass(String data, int count, double value) {
        this.data = data;
        this.count = count;
        this.value = value;
    }
}
