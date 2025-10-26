package Zavialov;

import java.util.Arrays;
import java.util.Scanner;
import Lab1.*;
import Lab2.*;
import Lab3.Zavialov.Name.*;
import Lab3.Zavialov.Misc.*;
import Lab3.Zavialov.Birds.*;

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
                Human person1 = new Human("Клеопатра", "", "", 152);
                Human person2 = new Human("Александр", "Пушкин", "Сергеевич", 167);
                Human person3 = new Human("Владимир", "Маяковский", "", 189);
                Human person10 = new Human("Христофор", "Банифатьевич", "", 100);

                System.out.println("Current human beings:");
                System.out.println(person1.toString());
                System.out.println(person2.toString());
                System.out.println(person3.toString());
                System.out.println(person10.toString() + " (height used for the sake of simplicity)" + "\n");

                Human person4 = new Human("Иван", "Чудов", "", 160);
                Human person5 = new Human("Петр", 156, person4);
                Human person6 = new Human("Борис", 186, person5);
                System.out.println("Like father like son:");
                System.out.println(person4.toString());
                System.out.println(person5.toString());
                System.out.println(person6.toString() + "\n");

                Human person7 = new Human("Лев", 170);
                Human person8 = new Human("Сергей", "Пушкин", 168, person7);
                Human person9 = new Human("Александр", 167, person8);
                System.out.println("Russian roulette of generation:");
                System.out.println(person7.toString() + "    Name and height");
                System.out.println(person8.toString() + "    Name, Surname, height and father");
                System.out.println(person9.toString() + "    Name, height and father" + "\n");

                Cat Kitty = new Cat("Барсик");
                System.out.println(Kitty.toString());
                Kitty.Meow();
                Kitty.Meow(3);
                System.out.println("\n");

                City A = new City("A");
                City B = new City("B");
                City C = new City("C");
                City D = new City("D");
                City E = new City("E");
                City F = new City("F");

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

                System.out.println(A.toString());
                System.out.println(B.toString());
                System.out.println(C.toString());
                System.out.println(D.toString());
                System.out.println(E.toString());
                System.out.println(F.toString());
            }
            case "3" -> {
                HumanUpd _person1 = new HumanUpd("Иван", "Чудов", "", 160);
                HumanUpd _person2 = new HumanUpd("Петр", 156, _person1);
                System.out.println("Current human beings:");
                System.out.println(_person1.toString());
                System.out.println(_person2.toString());
                _person1.setHeight(182);
                System.out.println("Now we put incorrect height");
                _person1.setHeight(600);
                System.out.println("And father");
                System.out.println(_person2.getFather().toString() + " - Father");
                System.out.println("And name");
                System.out.println(_person2.getName().toString() + " - Name");

                System.out.println("\n" + "Secrets");
                Secret mystery = new Secret("Some important stuff and such, just wanna test if it works",
                        "Arthur");
                Secret DidYouKnow = new Secret(mystery, "Arthur");
                System.out.println(DidYouKnow.toString());
                System.out.println("It was him: " + DidYouKnow.findBody(-1) + "! He told it to me");
                System.out.println(DidYouKnow.getOrderPrev() + " to know this secret");
                System.out.println(mystery.getOrderNext() + " know about it besides author");
                System.out.println(DidYouKnow.findDamage(-1) + " mistakes were caused via transmission");
                Secret secret_1 = new Secret(mystery, "Arthur");
                DidYouKnow.setName("Person 2");
                Secret secret_2 = new Secret(DidYouKnow, "Person 2");
                System.out.println(secret_2.findDamage(-2) + " mistakes were caused via transmission");
                System.out.println(secret_2.toString());

                System.out.println("\n" + "Dots");
                Dot dot_1 = new Dot(12,3,16);
                Dot dot_2 = new Dot(11,3,14);
                Dot dot_3 = dot_1.clone();
                System.out.println(dot_1.toString());
                System.out.println(dot_1.equals(dot_2));
                System.out.println(dot_1.equals(dot_3));

                System.out.println("\n" + "Birds");
                Parrot par = new Parrot();
                Cuckoo cuc = new Cuckoo();
                Sparrow spa = new Sparrow();
                System.out.println(par.singSong());
                System.out.println(cuc.singSong());
                System.out.println(spa.singSong());

                System.out.println("\n" + "Cats");
                MeowCheck cat1 = new Cat("Барсик");
                MeowCheck cat2 = new Cat("Не Барсик");
                System.out.println("List of meow-able object");
                MeowCheck[] meowArray = {cat1, cat2};
                MeowChecking.makeAllMeow(meowArray);


            }
            default -> System.out.println("Incorrect input, this lab doesn't exist yet. " +
                    "try again be restarting the program.");
        }

    }

}

