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

                System.out.println("(isInRange) Please, input 2 numbers as a boarder and 1 in between");
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
                System.out.println(test.numLen(intgr));

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
            case "2" -> {
                Lab2.Human person1 = new Lab2.Human("Клеопатра", "", "", 152);
                Lab2.Human person2 = new Lab2.Human("Александр", "Пушкин", "Сергеевич", 167);
                Lab2.Human person3 = new Lab2.Human("Владимир", "Маяковский", "", 189);
                Lab2.Human person10 = new Lab2.Human("Христофор", "Банифатьевич", "", 100);

                System.out.println("Current human beings:");
                System.out.println(person1.toString());
                System.out.println(person2.toString());
                System.out.println(person3.toString());
                System.out.println(person10.toString() + " (height used for the sake of simplicity)" + "\n");

                Lab2.Human person4 = new Lab2.Human("Иван", "Чудов", "", 160);
                Lab2.Human person5 = new Lab2.Human("Петр", 156, person4);
                Lab2.Human person6 = new Lab2.Human("Борис", 186, person5);
                System.out.println("Like father like son:");
                System.out.println(person4.toString());
                System.out.println(person5.toString());
                System.out.println(person6.toString() + "\n");

                Lab2.Human person7 = new Lab2.Human("Лев", 170);
                Lab2.Human person8 = new Lab2.Human("Сергей", "Пушкин", 168, person7);
                Lab2.Human person9 = new Lab2.Human("Александр", 167, person8);
                System.out.println("Russian roulette of generation:");
                System.out.println(person7.toString() + "    Name and height");
                System.out.println(person8.toString() + "    Name, Surname, height and father");
                System.out.println(person9.toString() + "    Name, height and father" + "\n");

                Lab2.Cat Kitty = new Lab2.Cat("Барсик");
                System.out.println(Kitty.toString());
                Kitty.Meow();
                Kitty.Meow(3);
                System.out.println("\n");

                Lab2.City A = new Lab2.City("A");
                Lab2.City B = new Lab2.City("B");
                Lab2.City C = new Lab2.City("C");
                Lab2.City D = new Lab2.City("D");
                Lab2.City E = new Lab2.City("E");
                Lab2.City F = new Lab2.City("F");

                A.addRoute(F, 1);
                A.addRoute(B, 5);
                A.addRoute(D, 6);
                B.addRoute(A, 5);
                B.addRoute(C, 3);
                C.addRoute(B, 3);
                C.addRoute(D, 4);
                D.addRoute(C, 4);
                D.addRoute(E, 2);
                D.addRoute(A, 6);
                E.addRoute(F, 2);
                F.addRoute(E, 2);
                F.addRoute(B, 1);

                System.out.println(A.getCityData());
                System.out.println(B.getCityData());
                System.out.println(C.getCityData());
                System.out.println(D.getCityData());
                System.out.println(E.getCityData());
                System.out.println(F.getCityData());
            }
            default -> System.out.println("Incorrect input, this lab doesn't exist yet. " +
                    "try again be restarting the program.");
        }

    }

}
