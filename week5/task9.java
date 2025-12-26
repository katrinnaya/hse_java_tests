import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

class Calculator {
    private int current;

    public Calculator(int current) {
        this.current = current;
    }

    public int plus(int number) { 
        current += number;
        System.out.println(current);
        return current;

    }

    public int minus(int number) {
        current -= number;
        System.out.println(current);
        return current;        
    } 
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int current = scanner.nextInt();
        int q = scanner.nextInt(); // кол-во операций

        Calculator calculator = new Calculator(current);
        for (int i = 0; i < q; i++) {
            String line = scanner.next(); // строка с операцией
            
            char operation = line.charAt(0); // сам знак
            
            String numberStr = line.substring(1); // всё с 1 индекса (после знака)
            int number = Integer.parseInt(numberStr);
            
            if (operation == '+') {
                calculator.plus(number);
            } else if (operation == '-') {
                calculator.minus(number);
            }
        }
        scanner.close();
    }
}
