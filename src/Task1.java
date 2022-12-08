import java.util.Scanner;

public class Task1 {

//    Написать метод, принимающий на вход два целых числа и проверяющий, что их
//    сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
//    в противном случае – false.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа:");
        int number1 = sc.nextInt(), number2 = sc.nextInt();
        sc.close();
        System.out.println(new Task1().sum(number1, number2));

    }
    public boolean sum(int num1, int num2){
        return num1 + num2 >= 10 && num1 + num2 <= 20;
    }
}