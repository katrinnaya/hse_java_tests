import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] orig = new int[n];

        for (int i = 0; i < n; i++) {
            orig[i] = scanner.nextInt(); // исходный массив, читаем
        }

        int[] final_res = new int[n]; // новый массив для вычислений

        for (int i = 0; i < n; i++) {
            int prev = (i == 0) ? orig[i] : orig[i - 1]; // если i == 0 (текущий), то prev = текущий, иначе = предыдущий
            int next = (i == n - 1) ? orig[i] : orig[i + 1]; // если i == n - 1 (последний), то next = текущий, иначе = следующий
            final_res[i] = next - prev; // подставим нужные значения по элементам, след - пред
        }

        for (int i = 0; i < n; i++) {
            System.out.print(final_res[i] + " ");
        }
        scanner.close();
    }
}
