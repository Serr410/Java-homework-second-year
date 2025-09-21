import java.lang.Math;
public class Lab1 {
    public double fraction(double num) {
        return num - (int) num;
    }
    public int charToNum(char num) {
        if (num < '0' || num > '9') {
            System.out.println("Error. Not a number.");
            return(-1);
        }
        return (num - '0');
    }
    public boolean is2Digits(int x) {
        return x < 100 && x > 9;
    }
    public boolean isInRange(int a, int b, int num) {
        if (a >= b && num >= b && num <= a) return true;
        else return a <= b && num >= a && num <= b;
    }
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }
    public int abs(int x) {
        return Math.abs(x);
    }
    public boolean is35(int x) {
        if (x % 3 == 0 && x % 5 == 0) return false;
        else return x % 3 == 0 || x % 5 == 0;
    }
    public int max3(int x, int y, int z) {
        if (x >= y && x >= z) return x;
        else if (y >= x && y >= z) return y;
        else return z;
    }
    public int sum2(int x, int y) {
        if (x + y > 9 && x + y < 20) return 20;
        else return x + y;
    }
    public String day(int x) {
        return switch (x) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Not a day of the week.";
        };
    }
    public String listNums(int x) {
        String str = "";
        for (int i = 0; i <= x; i++) {
            str = str + (char) (i + '0');
        }
        return str;
    }
    public String chet(int x) {
        int i = 0;
        String str = "";
        while (i < x) {
            str = str + (char) (i + '0');
            i = i + 2;
        }
        return str;
    }
    public int numLen(long x) {
        int i = 0;
        while (x != 0) {
            i++;
            x = x / 10;
        }
        return i;
    }
    public void square(int x) {
        String str = "";
        for (int j = 0; j < x; j++) {
            str = str + '*';
        }
        for (int i = 0; i < x; i++) {
            System.out.println(str);
        }
    }
    public void rightTriangle(int x) {
        String str;
        int xcopy = x;
        for (int i = 0; i < x; i++) {
            str = "";
            for (int j = xcopy; j >= 1; j--) {
                str = str + ' ';
            }
            for (int j = 0; j <= i; j++) {
                str = str + '*';
            }
            xcopy--;
            System.out.println(str);
        }
    }
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i + 1;
        }
        return -1;
    }
    public int maxAbs(int[] arr) {
        int x = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(x)) x = arr[i];
        }
        return x;
    }
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] both = new int[arr.length + ins.length];
        int counter = 0;
        for (int i = 0; i < both.length; i++) {
            if (i == pos) {
                for (int j = 0; j < ins.length; j++) {
                    both[i] = ins[j];
                    i++;
                }
            }
            both[i] = arr[counter];
            counter ++;
        }
        return both;
    }
    public int[] reverseBack(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }
        return arr;
    }
    public int[] findAll(int[] arr, int x) {
        int[] gotcha = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                gotcha[j] = i;
                j++;
            };
        }
        return gotcha;
    }

}
