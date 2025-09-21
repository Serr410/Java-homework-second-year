import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, choose from existing labs: ");
        String lab = scanner.nextLine();
        switch (lab) {
            case "1" -> {
                Lab1 test = new Lab1();

                System.out.println("(fraction) Please, input any number, preferably with fractions");
                double num = scanner.nextDouble();
                System.out.println(test.fraction(num));

                System.out.println("(charToNum) Please, input a number 0 - 9");
                char ch = scanner.next().charAt(0);
                System.out.println(test.charToNum(ch));

                System.out.println("(is2Digits) Please, input a number");
                int intgr = scanner.nextInt();
                System.out.println(test.is2Digits(intgr));

                /*System.out.println("(isInRange) Please, input 2 numbers as a boarder and 1 in between");
                int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
                System.out.println(test.isInRange(a, b, c));

                System.out.println("(isEqual) Please, input 3 numbers");
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                System.out.println(test.isEqual(a, b, c));

                System.out.println("(abs) Please, input a number");
                intgr = scanner.nextInt();
                System.out.println(test.abs(intgr));

                System.out.println("(is35) Please, input a number");
                intgr = scanner.nextInt();
                System.out.println(test.is35(intgr));

                System.out.println("(max3) Please, input 3 numbers");
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                System.out.println(test.max3(a, b, c));

                System.out.println("(sum2) Please, input 2 numbers");
                a = scanner.nextInt();
                b = scanner.nextInt();
                System.out.println(test.sum2(a, b));

                System.out.println("(day) Please, input a number");
                intgr = scanner.nextInt();
                System.out.println(test.day(intgr));

                System.out.println("(listNums) Please, input a number");
                intgr = scanner.nextInt();
                System.out.println(test.listNums(intgr));

                System.out.println("(chet) Please, input a number");
                intgr = scanner.nextInt();
                System.out.println(test.chet(intgr));

                System.out.println("(numLen) Please, input a number");
                intgr = scanner.nextInt();
                System.out.println(test.numLen(intgr));*/

                System.out.println("(square) Please, input a number");
                intgr = scanner.nextInt();
                test.square(intgr);

                System.out.println("(rightTriangle) Please, input a number");
                intgr = scanner.nextInt();
                test.rightTriangle(intgr);

                System.out.println("(findFirst) Please, input size of array. This will be used" +
                        " in every further tasks");
                intgr = scanner.nextInt();
                int[] arr = new int[intgr];
                System.out.println("Please, input numbers 1 by 1");
                for (int i = 0; i < intgr; i++) {
                    arr[i] = scanner.nextInt();
                }
                System.out.println("Please, input number");
                intgr = scanner.nextInt();
                System.out.println(test.findFirst(arr, intgr));

                System.out.println("(maxAbs) Previouse array will be used");
                System.out.println(test.maxAbs(arr));

                System.out.println("(add) Please, input size of array. This will be used" +
                        " as a second array in every further tasks when needed");
                intgr = scanner.nextInt();
                int[] ins = new int[intgr];
                System.out.println("Please, input numbers 1 by 1");
                for (int i = 0; i < intgr; i++) {
                    ins[i] = scanner.nextInt();
                }
                System.out.println("Please, input number");
                intgr = scanner.nextInt();
                System.out.println(Arrays.toString(test.add(arr, ins, intgr)));

                System.out.println("(reverseBack) Previouse array will be used");
                System.out.println(Arrays.toString(test.reverseBack(arr)));

                System.out.println("(findAll) Previouse array will be used");
                System.out.println("Please, input number");
                intgr = scanner.nextInt();
                System.out.println(Arrays.toString(test.findAll(arr, intgr)));


            }
            default -> System.out.println("Incorrect input, this lab doesn't exist yet. " +
                    "try again be restarting the program.");
        }

    }

}
