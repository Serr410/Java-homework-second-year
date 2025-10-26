package Lab3.Zavialov.Birds;

import java.util.Random;

public class Parrot extends Bird_basic {
    public Parrot() {
        super("Parrot", "Kesha horoshi");
    }
    public Parrot(String phrase) {
        super("Parrot", phrase);
    }
    public String singSong() {
        if (this.song.isEmpty()) {
            return "Nothing to sing about";
        }
        Random rand = new Random();
        int n = rand.nextInt(this.song.length()) + 1;
        return this.song.substring(0, n);
    }
}
