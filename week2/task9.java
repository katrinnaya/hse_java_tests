import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        int n = scanner.nextInt();
        int sum = 0; // сумма всех цифр в n 

        while(n > 0) {
            sum += n % 10; // добавляем к сумме последнюю цифру числа      
            n /= 10; // удаляем эту цифру и так пока не осанется 0 (те закончатся цифры)
        }
       System.out.println(sum);        
    }
}
