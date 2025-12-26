import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); 
        
        if ((num / 1000) == (num % 10) && // если 1 и 4 равны
            ((num / 100) % 10) == ((num / 10) % 10)) { // если 2 и 3 равны
            System.out.println(1); // палиндром
        } else {
            System.out.println(-1); 
        }
    }
}
