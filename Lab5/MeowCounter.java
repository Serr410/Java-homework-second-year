package Lab5;

import Lab2.Cat;
import Zavialov.MeowCheck;

public class MeowCounter implements MeowCheck {
    private int counter;
    private Cat cat;

    public MeowCounter(Cat cat) {
        this.cat = cat;
        this.counter = 0;
    }
    public int getCounter() {
        return this.counter;
    }

    @Override
    public void Meow() {
        this.cat.Meow();
        this.counter = this.counter + 1;
    }
    @Override
    public void Meow(int n) {
        this.cat.Meow(n);
        this.counter = this.counter + n;
    }
    @Override
    public String toString() {
        return this.cat.toString();
    }
}
