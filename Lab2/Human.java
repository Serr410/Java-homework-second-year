package Lab2;

public class Human {
    private int height;
    private Name name;
    private Human father;
    public void setHeight(int height) {
        if (height < 50) {
            System.out.println("Error. Height impossible in " + this.name.toString());
        } else {
            this.height = height;
        }
    }

    public Human(String Fname, int height, Human father){
        this.name = new Name(Fname, father.name.Sname, father.name.Fname + "ович");
        this.setHeight((height));
        this.father = father;
    }
    public Human(String Fname, String Sname, String Lname, int height){
        this.name = new Name(Fname, Sname, Lname);
        this.setHeight((height));
        this.father = new Human("Null-human");
    }
    private Human(String Fname){
        this.name = new Name(Fname, "", "");
        this.height = -1;
    }
    public Human(){
        this.name = new Name();
        this.height = -1;
        this.father = new Human("Null-human");
    }
    public Human(String Fname, int height){
        this.name = new Name(Fname, "", "");
        this.setHeight(height);
    }
    public Human(String Fname, String Sname, int height, Human father){
        this.name = new Name(Fname, Sname, father.name.Fname + "ович");
        this.setHeight((height));
        this.father = father;
    }

    @Override
    public String toString() {
        return (name.toString() + " " + height);
    }
}

