package Lab2;

public class Name {
    String Fname;
    String Sname;
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

