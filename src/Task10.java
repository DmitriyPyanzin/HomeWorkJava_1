import java.util.Arrays;
import java.util.Scanner;

public class Task10 {

//    Написать метод, принимающий на вход два аргумента: len и initialValue,
//    и возвращающий одномерный массив типа int длиной len,
//    каждая ячейка которого равна initialValue;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt(), initialValue = sc.nextInt();
        sc.close();
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
