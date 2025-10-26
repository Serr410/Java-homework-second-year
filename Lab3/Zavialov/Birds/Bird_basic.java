package Lab3.Zavialov.Birds;

public class Bird_basic {
    protected String song;
    protected int legs;
    protected String food;
    protected boolean is_flying;
    protected String spec;

    public String getSong() {
        return this.song;
    }
    public int getLegs() {
        return this.legs;
    }
    public String getFood() {
        return this.food;
    }
    public boolean Is_flying() {
        return this.is_flying;
    }
    public String getSpec() {
        return this.spec;
    }
    public void setSong(String song) {
        this.song = song;
    }
    public void setFood(String food) {
        this.food = food;
    }
    public void setIs_flying(boolean is_flying) {
        this.is_flying = is_flying;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public void setSpec(String spec) {
        this.spec = spec;
    }

    protected Bird_basic(String spec, String song) {
        this.song = song;
        this.legs = 2;
        this.food = "Seeds";
        this.is_flying = true;
        this.spec = spec;
    }

    protected String singSong() {
        return this.song;
    }
}
