import java.util.Scanner;

public class Task9 {

//    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
//    (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно
//    по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int[][] matrix = new int[num][num];
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if (i == j) matrix[i][j] = 1;
                matrix[i][num - 1 - i] = 1;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
