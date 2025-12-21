package Zavialov;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

import Lab1.*;
import Lab2.*;
import Lab3.Zavialov.name.*;
import Lab3.Zavialov.misc.*;
import Lab3.Zavialov.Birds.*;
import Lab4.*;
import Lab5.*;
import Lab6.Annot.AnnotClass;
import Lab6.Annot.InvokeProcessor;
import Lab6.Cache.CacheClass;
import Lab6.Cache.CacheProcessor;
import Lab6.Default.DefaultClass;
import Lab6.Default.DefaultProcessor;
import Lab6.ToString.ToStringClass;
import Lab6.ToString.ToStringProcessor;
import Lab6.Two.TwoClass;
import Lab6.Two.TwoProcessor;
import Lab6.Validate.ValidClass;
import Lab6.Validate.ValidateProcessor;

import static Lab4.ListFilter.filterList;
import static Lab4.ListReducer.reduceList;
import static Lab4.ListTransformer.transformList;
import static Lab5.Remover.removeConsecutiveDuplicates;


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
            case "4" -> {
                var box = new Box<Integer>(3);
                System.out.println(box.lookInside());
                box.putInside(5);
                System.out.println(box.unpackItem());
                box.putInside(5);
                System.out.println(box.lookInside() + "\n");

                var vault1 = new Vault<Integer>(null, 0);
                System.out.println(vault1.lookInside());
                var vault2 = new Vault<Integer>(99, -1);
                System.out.println(vault2.lookInside());
                var vault3 = new Vault<String>(null, "default");
                System.out.println(vault3.lookInside());
                var vault4 = new Vault<String>("hello", "hello world");
                System.out.println(vault4.lookInside() + "\n");

                var boxdot = new Box<Dot>(new Dot(2, 2, 3));
                System.out.println(boxdot.lookInside().toString());

                List<String> strings = List.of("qwerty", "asdfg", "zx");
                List<Integer> stringLengths = transformList(strings, new Transformer<String, Integer>() {
                    public Integer apply(String value) {
                        return value.length();
                    }
                });
                System.out.println("String length: " + stringLengths);
                List<Integer> numbers = List.of(1, -3, 7);
                List<Integer> positiveNumbers = transformList(numbers, new Transformer<Integer, Integer>() {
                    public Integer apply(Integer value) {
                        return Math.abs(value);
                    }
                });
                System.out.println("Positive numbers: " + positiveNumbers);
                List<int[]> arrays = List.of(
                        new int[]{1, 2, 3},
                        new int[]{-5, -4, -10},
                        new int[]{10, 20, 30, 5}
                );
                List<Integer> maxValues = transformList(arrays, new Transformer<int[], Integer>() {
                    public Integer apply(int[] value) {
                        int max = value[0];
                        for (int num : value) {
                            if (num > max) {
                                max = num;
                            }
                        }
                        return max;
                    }
                });
                System.out.println("Max value: " + maxValues);

                List<String> filteredStrings = filterList(strings, new Filter<String>() {
                    public boolean test(String value) {
                        return value.length() >= 3;
                    }
                });
                System.out.println("String greater than 3: " + filteredStrings);
                List<Integer> filteredNumbers = filterList(numbers, new Filter<Integer>() {
                    public boolean test(Integer value) {
                        return value > 0;
                    }
                });
                System.out.println("Positive numbers: " + filteredNumbers);
                List<int[]> arraysWithoutPositive = filterList(arrays, new Filter<int[]>() {
                    public boolean test(int[] array) {
                        for (int num : array) {
                            if (num > 0) {
                                return false;
                            }
                        }
                        return true;
                    }
                });
                System.out.print("Negative arrays: ");
                for (int[] arr : arraysWithoutPositive) {
                    System.out.print("[");
                    for (int i = 0; i < arr.length; i++) {
                        System.out.print(arr[i]);
                        if (i < arr.length - 1) System.out.print(", ");
                    }
                    System.out.println("]");
                }

                String sum = reduceList(strings, new Reducer<String>() {
                    public String apply(String accumulator, String current) {
                        return accumulator + current;
                    }
                }, "");
                System.out.println("Summed up: " + sum);

                Integer summary = reduceList(numbers, new Reducer<Integer>() {
                    public Integer apply(Integer accumulator, Integer current) {
                        return accumulator + current;
                    }
                }, 0);
                System.out.println("Summed up: " + summary);
                List<List<Integer>>GrandList = List.of(
                        List.of(1, 2, 3),
                        List.of(4, 5),
                        List.of(6, 7, 8, 9)
                );
                List<Integer> sizes = new ArrayList<>();
                for (List<Integer> list : GrandList) {
                    sizes.add(list.size());
                }
                Integer totalElements3 = reduceList(sizes, new Reducer<Integer>() {
                    public Integer apply(Integer accumulator, Integer current) {
                        return accumulator + current;
                    }
                }, 0);
                System.out.println("Summed up: " + totalElements3);


            }
            case "5" -> {
                Fraction fraction1 = new Fraction(1, 2);
                Fraction fraction2 = new Fraction(2, 4);
                Fraction fraction3 = new Fraction(1, 2);
                System.out.println("Fraction 1: " + fraction1);
                System.out.println("Fraction 2: " + fraction2);
                System.out.println("Fraction 3: " + fraction3);
                System.out.println("Decimal value of fraction 1: " + fraction1.getDecimalValue());
                System.out.println("Decimal value of fraction 2: " + fraction2.getDecimalValue());
                System.out.println("First computation (cached): " + fraction1.getDecimalValue());
                System.out.println("Second computation (from cache): " + fraction1.getDecimalValue());
                System.out.println("fraction1.equals(fraction2): " + fraction1.equals(fraction2));
                System.out.println("fraction1.equals(fraction3): " + fraction1.equals(fraction3));
                Fraction negativeFraction = new Fraction(-1, -2);
                System.out.println("Negative fraction: " + negativeFraction);
                System.out.println("Decimal value: " + negativeFraction.getDecimalValue());
                fraction1.setNumerator(3);
                System.out.println("After changing numerator: " + fraction1);
                System.out.println("Decimal value: " + fraction1.getDecimalValue());
                System.out.println("Before denominator change: " + fraction1.getDecimalValue());
                fraction1.setDenominator(6);
                System.out.println("After denominator change: " + fraction1.getDecimalValue());

                Cat originalCat = new Cat("Barsik");
                System.out.println("\nCreated: " + originalCat);
                MeowCounter countingCat = new MeowCounter(originalCat);
                countingCat.Meow(3);
                System.out.println("\nMeowed " + countingCat.getCounter() + " times");

                List<Integer> numbers = List.of(1, 1, 2, 2, 2, 3, 1, 1, 4, 4, 5, 5, 5, 5);
                List<Integer> uniqueNumbers = removeConsecutiveDuplicates(numbers);

                System.out.println("Original: " + numbers);
                System.out.println("Cleared: " + uniqueNumbers + "\n");

                //SpoiledMilk.Milk();

                System.out.println(Arrays.toString(Texter.digits("text.txt")) + "\n"); //Use full path, otherwise won't work

                Queue<Integer> queue1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 1));
                Queue<Integer> queue2 = new LinkedList<>(Arrays.asList(1, 2, 2, 3, 4));
                System.out.println("Queue [1, 2, 3, 4, 1]: " + QueueCheck.hasEqualNeighbors(queue1));
                System.out.println("Queue [1, 2, 2, 3, 4]: " + QueueCheck.hasEqualNeighbors(queue2) + "\n");

                List<Point> points = Arrays.asList(
                        new Point(3, -2),
                        new Point(1, 5),
                        new Point(3, -2),  // double
                        new Point(5, -7),  // double negative
                        new Point(2, 3),
                        new Point(1, 5),   // double
                        new Point(4, 4),
                        new Point(0, -1),
                        new Point(5, 7)    // double to negative
                );

                System.out.println("Starting points:");
                points.forEach(System.out::println);

                Polyline polyline = StreamPoint.processPoints(points);

                System.out.println("\nFinal line:");
                System.out.println(polyline + "\n");

                NameTester.tester("people.txt");  //Use full path, otherwise won't work
            }
            case "6" -> {
                AnnotClass unit = new AnnotClass("unit");
                try {
                    InvokeProcessor.processAnnotations(unit);
                } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException |
                         InstantiationException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(unit.getName() + "\n");

                DefaultClass defunit = new DefaultClass("unit");
                try {
                    DefaultProcessor.processAnnotations(unit);
                    DefaultProcessor.processAnnotations(defunit);
                } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException |
                         InstantiationException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(defunit.getName() + "\n");

                ToStringClass strClass = new ToStringClass("Ivan", 30, "secret123", "ivan@gmail.com");
                StringBuilder result;
                try {
                    result = ToStringProcessor.processAnnotations(strClass);
                } catch (InvocationTargetException | IllegalAccessException | NoSuchMethodException |
                         InstantiationException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(result);

                ValidClass valid = new ValidClass("New Data", 0, 1);
                ValidateProcessor.processAnnotation(valid);
                System.out.println("\n");

                TwoClass two = new TwoClass("That's me", 15);
                TwoProcessor.processAnnotation(two);
                System.out.println("\n");

                CacheClass cache = new CacheClass("Name sample");
                CacheProcessor.processCacheAnnotation(cache);
            }
            default -> System.out.println("Incorrect input, this lab doesn't exist yet. " +
                    "try again be restarting the program.");
        }
    }
}
