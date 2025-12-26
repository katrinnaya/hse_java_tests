import java.util.Scanner;
// import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine(); 
        String[] arr = n.split("\\s+"); // любой пробел 1 и более раз (/ для экранирования)
              
        int count = 0;
        for (String s : arr) {
            if (s.matches("[a-zA-Z]+")) { // только символы латинского алфавита
                count++;
            }
        }
        
        System.out.println(count);
        
        scanner.close();
    }
}
