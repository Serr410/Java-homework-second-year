package Lab6.Default;

@Default(String.class)
public class DefaultClass {
    @Default(String.class)
    private String name;

    public DefaultClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
