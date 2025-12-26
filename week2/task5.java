import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        int v = scanner.nextInt();
        int p = scanner.nextInt();
        
        if (v > p) {
            System.out.println("Vasya");
        } else if (p > v) {
            System.out.println("Petya");
        } else {
            System.out.println("Same");
        }
    }
}
