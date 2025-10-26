package Lab3.Zavialov.Birds;

import java.util.Random;

public class Cuckoo extends Bird_basic {
    public Cuckoo() {
        super("Cuckoo", "Cuckoo");
    }
    public String singSong() {
        Random rand = new Random();
        String song = "";
        for (int i = 0; i < rand.nextInt(10); i ++) {
            song = song + super.singSong() + " ";
        }
        return song;
    }
}
