package Lab5;

import java.util.Scanner;

public class SpoiledMilk {
    public static void Milk() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        int minPrice15 = Integer.MAX_VALUE;
        int minPrice20 = Integer.MAX_VALUE;
        int minPrice25 = Integer.MAX_VALUE;

        int count15 = 0;
        int count20 = 0;
        int count25 = 0;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");

            int fatContent = Integer.parseInt(parts[parts.length - 2]);
            int price = Integer.parseInt(parts[parts.length - 1]);

            switch (fatContent) {
                case 15:
                    if (price < minPrice15) {
                        minPrice15 = price;
                        count15 = 1;
                    } else if (price == minPrice15) {
                        count15++;
                    }
                    break;

                case 20:
                    if (price < minPrice20) {
                        minPrice20 = price;
                        count20 = 1;
                    } else if (price == minPrice20) {
                        count20++;
                    }
                    break;

                case 25:
                    if (price < minPrice25) {
                        minPrice25 = price;
                        count25 = 1;
                    } else if (price == minPrice25) {
                        count25++;
                    }
                    break;
            }
        }

        if (minPrice15 == Integer.MAX_VALUE) {
            count15 = 0;
        }
        if (minPrice20 == Integer.MAX_VALUE) {
            count20 = 0;
        }
        if (minPrice25 == Integer.MAX_VALUE) {
            count25 = 0;
        }

        System.out.println(count15 + " " + count20 + " " + count25);

        scanner.close();
    }
}