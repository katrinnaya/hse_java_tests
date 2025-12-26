import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        int n = scanner.nextInt();
        
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) { // если нет остатка от деления, то четное 
                System.out.print(i + " "); // вывод через пробел 
            }
        }
    }
}
