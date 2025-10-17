package Lab2;

public class Cat {
    private String name;

    public Cat(String name){
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Meow() {
        System.out.println("Meow");
    }
    public void Meow(int n) {
        if (n < 1) {
            System.out.print("HSSSSS...");
            return;
        }
        if (n == 1) {
            System.out.print("Meow");
        } else {
            System.out.print("Meow-");
            for (int i = 2; i < n; i++) {
                System.out.print("Meow-");
            }
            System.out.print("Meow");
        }
    }

    @Override
    public String toString() {
        return ("Cat: " + this.name);
    }
}
