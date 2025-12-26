import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n]; // исходный массив 

        for (int i = 0; i < n / 2; i++) {  // первые n/2 элементов заполнить числами от 1 до n/2
            arr[i] = i + 1; 
        }

        for (int i = n / 2; i < n; i++) { // остальные элементы заполнить значением k
            arr[i] = k;
        }

        int [] sortedArr = arr.clone(); // Создать копию массива
        Arrays.sort(sortedArr); // отсортировать её 

        System.out.println(Arrays.toString(arr)); // Вывести оба массива
        System.out.println(Arrays.toString(sortedArr));

        System.out.println(Arrays.equals(arr, sortedArr) ? "YES" : "NO"); // результат сравнения (YES/NO)
        
        scanner.close();
    }
}   
