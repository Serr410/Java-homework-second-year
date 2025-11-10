package Lab4;

import java.util.ArrayList;
import java.util.List;

public final class Utilities {
    private Utilities() {
        throw new UnsupportedOperationException("Cant create an instance of this class.");
    }
    public static <T> List<T> task1(List<T> list) {
        if (list != null && !list.isEmpty()) {
            T firstElement = list.get(0);    //list.getFirst();
            List<Integer> counter = new ArrayList<>();
            if (firstElement instanceof String) {
                for (T str : list) {
                    counter.add(str.toString().length());
                }
            } else if (firstElement instanceof Integer) {
                for (T str : list) {
                    if ((int) str > 0) {
                        counter.add((int)str);
                    } else {
                        counter.add((int)str * (-1));
                    }
                }
            } else if (firstElement instanceof int[]) {
                for (T str : list) {
                    int[] array = (int[]) str;
                    counter.add(array.length);
                }
            }
            return (List<T>) counter;
        }
        return list;
    }

    public static <T> List<T> task2(List<T> list) {
        if (list != null && !list.isEmpty()) {
            T firstElement = list.get(0);    //list.getFirst();
            List<T> returner = new ArrayList<>();
            if (firstElement instanceof String) {
                for (T str : list) {
                    if (str.toString().length() >= 3) {
                        returner.add(str);
                    }
                }
            } else if (firstElement instanceof Integer) {
                for (T str : list) {
                    if ((int) str > 0) {
                        continue;
                    } else {
                        returner.add(str);
                    }
                }
            } else if (firstElement instanceof int[]) {
                for (T str : list) {
                    int[] array = (int[]) str;
                    boolean flag = false;
                    for (int elem : array) {
                        if (elem > 0) {
                            flag = true;
                        }
                    }
                    if (!flag) {
                        returner.add((T) array);
                    }
                }
            }
            return returner;
        }
        return list;
    }

    public static <T> T task3(List<T> list) {
        if (list != null && !list.isEmpty()) {
            T firstElement = list.get(0);    //list.getFirst();
            T counter = null;
            if (firstElement instanceof String) {
                for (T str : list) {
                    counter = (T)((String) counter + (String) str);
                }
            } else if (firstElement instanceof Integer) {
                for (T str : list) {
                    counter = (T)((counter + str);
                }
            } else if (firstElement instanceof int[]) {
                for (T str : list) {
                    int[] array = (int[]) str;
                    int sum = 0;
                    int count = (int) counter;
                    for (int elem : array) {
                        sum = sum + elem;
                    }
                    counter = (T) (count + sum);
                    
                }
            }
            return counter;
        }
        return list;
    }
}
