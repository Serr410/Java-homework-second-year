package Zavialov;

public class MeowChecking {
    public static void makeAllMeow(MeowCheck[] meowableObjects) {
        for (MeowCheck obj : meowableObjects) {
            obj.Meow();
        }
    }
}
