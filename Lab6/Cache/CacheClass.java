package Lab6.Cache;

@Cache({"users", "ID", "settings"})
public class CacheClass {
    private String Name;

    public CacheClass(String Name) {
        this.Name = Name;
    }

    public void getInfo(String Id) {
        System.out.println("Current ID: " + Id);
    }
}
