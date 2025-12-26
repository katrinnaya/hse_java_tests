import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (n > 1) { // если элементов больше одного то вывод слова и !
            int i = 1; // со второго индекса
            while (i < n) {
                if (arr[i] > arr[i - 1]) { // если текущий индекс больше предыдущего
                    System.out.print("YES");
                } else {
                    System.out.print("NO");
                }
                
                if (i == n - 1) {                     
                    System.out.print("!");
                } else {
                    System.out.print(" ");
                }
                i++;
            }
        }

        scanner.close();
    }
}
