import java.util.Scanner;

public class Task5 {

//    Написать метод, который определяет, является ли год високосным,
//    и возвращает boolean (високосный - true, не високосный - false).
//    Каждый 4-й год является високосным, кроме каждого 100-го,
//    при этом каждый 400-й – високосный.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год");
        int year = sc.nextInt();
        sc.close();
        System.out.println(new Task5().isLeapYear(year));
    }
    public boolean isLeapYear(int num) {
        return num % 4 == 0 && num % 100 != 0 || num % 400 == 0;
    }
}
