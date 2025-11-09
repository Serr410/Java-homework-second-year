package Lab4;

public class Box<T> {
    private  T item;

    public Box(T item) {
        this.item = item;
    }
    public Box() {
        this.item = null;
    }

    public T lookInside() {
        return this.item;
    }
    public T unpackItem() {
        T taken = this.item;
        this.item = null;
        return taken;
    }
    public void putInside(T item) {
        try {
            if (this.item != null) {
                throw new Throwable("Item box is full");
            }
            this.item = item;
        }
        catch(Throwable noItemSpace) {
            System.out.println("Error: " + noItemSpace.getMessage());
        }
    }
}
