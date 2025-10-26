package Lab3.Zavialov.misc;

public class Dot {
    private int x;
    private int y;
    private int z;

    public Dot(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Dot() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    @Override
    public String toString() {
        return ('{' + String.valueOf(this.x) + ';' + String.valueOf(this.y) +
                ';' + String.valueOf(this.z) + '}');
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()) return false;
        Dot other = (Dot) obj;
        return (this.x == other.x && this.y == other.y && this.z == other.z);
    }

    @Override
    public Dot clone() {
        return new Dot(this.x, this.y, this.z);
    }
}
