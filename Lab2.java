import java.util.HashMap;
import java.util.Map;

public class Lab2 {
    private static class Name {
        private String Fname;
        private String Sname;
        private String Lname;

        public Name(String Fname, String Sname, String Lname) {
            this.Fname = Fname;
            this.Sname = Sname;
            this.Lname = Lname;
        }
        public Name() {
            this("Null", "Null", "Null");
        }

        public void setName(String Fname, String Sname, String Lname) {
            this.Fname = Fname;
            this.Sname = Sname;
            this.Lname = Lname;
        }

        @Override
        public String toString() {
            if (this.Sname == "") {
                return (this.Fname + " " + this.Lname);
            }
            if (this.Fname == "") {
                return (this.Sname + " " + this.Lname);
            }
            if (this.Sname == "" && this.Fname == "") {
                return this.Lname;
            }
            return (this.Sname + " " + this.Fname + " " + this.Lname);
        }
    }
    public static class Human {
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

        public void setName(String Fname, String Sname, String Lname) {
            this.name.setName(Fname, Sname, Lname);
        }
        /*
        Current constructors:
            1. Fname, height, father
            2. Fname, Sname, Lname, height
            3. Null
            4. Fname, height
            5. Fname, Sname, height, father
            6. WIP(?)
        */
        @Override
        public String toString() {
            return (name.toString() + " " + height);
        }
    }

    public static class Cat {
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
    static class City {
        private String name;
        private HashMap<City, Integer> routes; // Город -> стоимость

        public City(String name) {
            this.name = name;
            this.routes = new HashMap<>();
        }

        public void addRoute(City dest, int cost) {
            routes.put(dest, cost);
        }

        public String getCityData() {
            String data = "City: " + this.name + "\n";

            for (HashMap.Entry<City, Integer> entry : routes.entrySet()) {
                data = data + entry.getKey().getName() + entry.getValue() + "\n";
            }
            return data;
        }

        public String getName() {
            return name;
        }

        public Map<City, Integer> getRoutes() {
            return routes;
        }
    }
}
