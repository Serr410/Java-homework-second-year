package Lab4;

public class Vault<T> {
    private  T item;
    private T alt;

    public Vault(T item, T alt) {
        this.item = item;
        this.alt = alt;
    }
    public Vault() {
        this.item = null;
        this.alt = null;
    }
    public T lookInside() {
        if (this.item == null) {
            return this.alt;
        }
        return this.item;
    }
    public void setAlt(T alt) {
        this.alt = alt;
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
