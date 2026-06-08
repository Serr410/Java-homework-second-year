package Lab3.Zavialov.Birds;

public class BirdBasic {
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
    public boolean IsFlying() {
        return this.isFlying;
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
    public void setIsFlying(boolean isFlying) {
        this.isFlying = isFlying;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }
    public void setSpec(String spec) {
        this.spec = spec;
    }

    protected BirdBasic(String spec, String song) {
        this.song = song;
        this.legs = 2;
        this.food = "Seeds";
        this.isFlying = true;
        this.spec = spec;
    }

    protected String singSong() {
        return this.song;
    }
}
