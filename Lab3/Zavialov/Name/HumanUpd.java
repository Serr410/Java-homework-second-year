package Lab3.Zavialov.Name;

import Lab3.Zavialov.Name.*;

public class HumanUpd {
    private int height;
    private NameUpd name;
    private HumanUpd father;
    public void setHeight(int height) {
        if (height > 500) {
            System.out.println("Error. Height impossible in " + this.name.toString());
        } else {
            this.height = height;
        }
    }
    public int getHeight() {
        return this.height;
    }
    public String getFather() {
        return this.father.toString();
    }
    public NameUpd getName() {
        return this.name;
    }

    public HumanUpd(String Fname, int height, HumanUpd father){
        this.name = new NameUpd(Fname, father.name.Sname, father.name.Fname + "ович");
        this.setHeight((height));
        this.father = father;
    }
    public HumanUpd(String Fname, String Sname, String Lname, int height){
        this.name = new NameUpd(Fname, Sname, Lname);
        this.setHeight((height));
        this.father = new HumanUpd("Null-human");
    }
    private HumanUpd(String Fname){
        this.name = new NameUpd(Fname, "", "");
        this.height = -1;
    }
    public HumanUpd(){
        this.name = new NameUpd();
        this.height = -1;
        this.father = new HumanUpd("Null-human");
    }
    public HumanUpd(String Fname, int height){
        this.name = new NameUpd(Fname, "", "");
        this.setHeight(height);
    }
    public HumanUpd(String Fname, String Sname, int height, HumanUpd father){
        this.name = new NameUpd(Fname, Sname, father.name.Fname + "ович");
        this.setHeight((height));
        this.father = father;
    }

    @Override
    public String toString() {
        return (name.toString() + " " + height);
    }
}

