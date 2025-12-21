package Lab6.ToString;

public class ToStringClass {
    private String name;
    private int age;

    @ToString(ToString.Bool.NO)
    private String password;

    private String email;

    public ToStringClass(String name, int age, String password, String email) {
        this.name = name;
        this.age = age;
        this.password = password;
        this.email = email;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPassword() { return password; }
    public String getEmail() { return email; }
}
