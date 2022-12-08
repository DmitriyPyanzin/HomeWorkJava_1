import java.util.Scanner;

public class Task12 {

//    Найти общий префикс среди слов из одного массива.
//    ["aaa", "aab", "aa"] -> "aa", ["abc", "bca", "cda"] -> ""

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Task12 t12 = new Task12();
        System.out.println("Введите элементы массива через пробел");
        String[] arr = sc.nextLine().split("\\s+");
        sc.close();
        if (arr.length == 0) {
            System.out.println("В массиве нет элеменов");
        } else {
            System.out.println("Вот такой вы ввели массив");
            t12.printArr(arr);
            t12.findPrefix(arr);
        }

    }

    public void printArr(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public void findPrefix(String[] array) {
        if (array.length == 1) {
            System.out.println("В массиве один элемент и не с чем сравнивать");
        } else {
            StringBuilder str = new StringBuilder();
            boolean is_prefix = true;
            int index = 0;
            while (is_prefix && index < findMinLen(array)) {
                for (int i = 1; i < array.length; i++) {
                    if (array[i].charAt(index) != array[i - 1].charAt(index)) {
                        is_prefix = false;
                        break;
                    }
                }
                if (is_prefix) {
                    str.append(array[0].charAt(index));
                }
                index++;
            }
            if (str.toString().equals("")) {
                System.out.println("У элементов массива нет общего префикса");
            } else {
                System.out.println("Общий префикс элементов " + str);
            }
        }

    }

    public int findMinLen(String[] array) {
        int minLen = array[0].length();
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() < minLen) {
                minLen = array[i].length();
            }
        }
        return minLen;
    }
}
