import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       
        int a = scanner.nextInt(); 
        int b = scanner.nextInt();
        double l = Math.sqrt(a * a + b * b); // формула длины радиус-вектора в 2-мерном простр-ве
        
        System.out.println(l);

        scanner.close();      
    }
}
