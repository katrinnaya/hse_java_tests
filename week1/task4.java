import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();   
        
        int sum = 0; // начинаем с нуля
        
        while (num > 0) { // цикл: пока число больше нуля, к сумме прибавляем последнее число             
            sum += num % 10;            
            num /= 10;                  
        }
        
        System.out.println(sum);         
    }
}
