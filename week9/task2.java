import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine());
        char d = scanner.nextLine().charAt(0);
        
        int bestBase = 0;           
        String bestResult = "";     
        int maxCount = -1; // -1 тк всегда меньше любого результата
        
        for (int base = 2; base <= 16; base++) {
            String currentResult = Integer.toString(n, base); // преобразуем число в текущую систему счисления
            int currentCount = counter(currentResult, d); 
            
            if (bestBase == 0 || 
                currentCount > maxCount || 
                (currentCount == maxCount && base < bestBase)) {
                
                bestBase = base;        
                bestResult = currentResult;
                maxCount = currentCount;   
            }
        }
        
        System.out.println(bestBase); 
        System.out.println(bestResult);          

        scanner.close();
    }
    
    public static int counter(String str, char digit) { // кол-во вхождений символа в строку
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == digit) {
                count++;
            }
        }
        return count;
    }
}
