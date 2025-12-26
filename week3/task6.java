import java.util.Scanner;
// import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); 
        int [][] arr = new int[n][n]; // квадратная матрица = двумерный массив

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i][i]; // номер строки=номер столбца
        }
        
        for (int i = 0; i < n; i++) {
            sum += arr[i][n-i-1]; // номер строки+номер столбца=размер - 1
        }

        if (n % 2 == 1) {
            sum -= arr[n/2][n/2]; // - центральный повторяющийся элемент, если размер нечетный
        }

        System.out.println(sum);
        scanner.close();
    }
}   
