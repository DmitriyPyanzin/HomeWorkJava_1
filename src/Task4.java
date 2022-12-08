import java.util.Scanner;

public class Task4 {

//    Написать метод, которому в качестве аргументов передается строка и число,
//    метод должен отпечатать в консоль указанную строку, указанное количество раз;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = sc.nextLine();
        System.out.println("Введите число");
        int num = sc.nextInt();
        sc.close();
        System.out.println(new Task4().repeatString(str, num));
    }

    public String repeatString(String text, int number) {
        if (number >= 1) {
            System.out.println(text);
            return repeatString(text, (number - 1));

        } else if (number == 0) {
            return "ВСЕ!";

        } else
            return "Вы ввели отрицательное число";
    }
}
