package Lab3.Zavialov.misc;
import java.util.Random;


public class Secret {
    private String knowledge;
    private String name;
    private Secret prev;
    private Secret next;
    private int damage;

    public Secret(String knowledge, String name) {
        this.knowledge = knowledge;
        this.name = name;
        this.prev = null;
        this.next = null;
        this.damage = 0;
    }
    public Secret(Secret mystery, String name) {
        if (mystery.next != null) {
            System.out.println(name + " don't feel like talking about " + mystery.knowledge);
            return;
        }
        System.out.println(name + " told about " + mystery.knowledge);
        Random rand = new Random();
        int damage = rand.nextInt(mystery.knowledge.length() / 10);
        StringBuilder Change = new StringBuilder(mystery.knowledge);
        for (int i = 0; i < damage; i ++) {
            Change.insert(rand.nextInt(mystery.knowledge.length()) + i, (char)rand.nextInt(1000));
            //Change.insert(rand.nextInt(mystery.knowledge.length()) + i, '_');  //To check mistakes
        }
        this.knowledge = Change.toString();
        this.prev = mystery;
        this.damage = damage;
        mystery.next = this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOrderPrev() {
        int order = 0;
        if (this.prev != null) {
            order = prev.getOrderPrev() + 1;
        }
        return order;
    }
    public int getOrderNext() {
        int order = 0;
        if (this.next != null) {
            order = next.getOrderNext() + 1;
        }
        return order;
    }
    public String findBody(int order) {
        String body = this.name;
        if (order > 0) {
            if (this.next == null) {
                return("He is dead");
            }
            body = this.next.findBody(order - 1);
        } else if (order < 0) {
            if (this.prev == null) {
                return("To the grave");
            }
            body = this.prev.findBody(order + 1);
        }
        return body;
    }
    public int findDamage(int order) {
        int damage = 0;
        boolean flag = false;
        if (order > 0) {
            if (this.next == null) {
                flag = true;
                return(-1);
            }
            damage = this.next.findDamage(order - 1) + this.next.damage;
        } else if (order < 0) {
            if (this.prev == null) {
                flag = true;
                return(-1);
            }
            damage = this.prev.findDamage(order + 1) + this.damage;
        }
        if (flag) {
            return -1;
        }
        return damage;
    }

    @Override
    public String toString() {
        return(this.name + ": its a secret! " + this.knowledge);
    }
}
