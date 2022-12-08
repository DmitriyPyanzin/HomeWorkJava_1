public class Task7 {

//    Задать пустой целочисленный массив длиной 100.
//    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void main(String[] args) {
        int[] arr = new int[100];
        Task7 t7 = new Task7();
        arr = t7.fillArray(arr);
        t7.printArray(arr);
    }
    public int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }
    
    public void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }
}
