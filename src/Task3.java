import java.util.Scanner;

public class Task3 {

//    Написать метод, которому в качестве параметра передается целое число.
//    Метод должен вернуть true, если число отрицательное, и вернуть false
//    если положительное.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();
        sc.close();
        System.out.println(new Task3().isNegative(number));
    }
    public boolean isNegative(int num) {
        return num < 0;
    }
}
