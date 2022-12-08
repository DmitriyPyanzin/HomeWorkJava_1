import java.util.Scanner;

public class Task2 {

//    Написать метод, которому в качестве параметра передается целое число,
//    метод должен напечатать в консоль, положительное ли число передали
//    или отрицательное. Замечание: ноль считаем положительным числом.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        sc.close();
        System.out.println(new Task2().isPositive(number));
    }
    public String isPositive(int num) {
        return num >= 0 ? "Положительное" : "Отрицательное";
    }
}
