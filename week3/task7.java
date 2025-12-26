import java.util.Scanner;
// import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        long [][] arr = new long[n][]; // сразу обозначая только кол-во строк

        for (int i = 0; i < n; i++) {
            arr[i] = new long [i + 1]; // строка i с массивом из i+1 элементов

            for (int j = 0; j <= i; j++) {
                arr[i][j] = (long)(i+1) * (j+1); // Каждый элемент равен произведению номера строки на номер столбца (оба начиная с 1)
            }                
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) { 
                System.out.print(arr[i][j]); // вывод значений элементов по строке

                if (j < arr[i].length - 1) {
                    System.out.print(" "); // если не последний элемент строки, то пробел
                }
            }
            System.out.println(); 
        }
        
        scanner.close();
    }
}
