package Lab3.Zavialov.name;

public class NameUpd {
    String Fname;
    String Sname;
    String Lname;

    public NameUpd(String Fname, String Sname, String Lname) {
        this.Fname = Fname;
        this.Sname = Sname;
        this.Lname = Lname;
    }
    public NameUpd() {
        this("Null", "Null", "Null");
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
