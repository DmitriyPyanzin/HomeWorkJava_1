import java.util.Scanner;
import java.util.logging.Logger;

public class Task11 {

//    Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logger log = Logger.getLogger(Task11.class.getName());
        Task11 t11 = new Task11();
        log.info("Задайте длину массива ");
        int[] arr = new int[sc.nextInt()];
        log.info("А теперь заполняем массив на " + arr.length + " элементов");
        arr = t11.fillArr(arr);
        log.info("Вот такой массив получился [ " + t11.printArr(arr) + "]");
        log.info("Максимальный элемент массива " + t11.findMax(arr));
        log.info("Минимальный элемент массива " + t11.findMin(arr));
        sc.close();
    }

    public int[] fillArr(int[] array) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        return array;
    }

    public String printArr(int[] array) {
        StringBuilder str = new StringBuilder();
        for (int j : array) {
            str.append(j).append(" ");
        }
        return str.toString();
    }

    public int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
