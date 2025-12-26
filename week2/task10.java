import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        int q = scanner.nextInt(); // кол-во
        int sum = 0; // сумма цифр

        for(int i = 0; i < q; i++) {
            int n = scanner.nextInt(); // считываем числа сразу по указанному кол-ву и складываем в сумму   
            sum += n;                   
        }
                
        System.out.println(sum);
    }
}
