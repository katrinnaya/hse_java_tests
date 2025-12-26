import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        int a = scanner.nextInt();

        System.out.println(a + (a % 2) + 1); // исход + остаток от деления (0 четн, 1 нечетн)+ переход к след числу   
    }
}
