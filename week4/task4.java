import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String n = scanner.nextLine();
        String result = n;
        result = result.replace("0", "zero");
        result = result.replace("1", "one");
        result = result.replace("2", "two");
        result = result.replace("3", "three");
        result = result.replace("4", "four");
        result = result.replace("5", "five");
        result = result.replace("6", "six");
        result = result.replace("7", "seven");
        result = result.replace("8", "eight");
        result = result.replace("9", "nine");  

        System.out.println(result);

        scanner.close();
    }
}
