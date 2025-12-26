import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();

        int firstI = n.indexOf('f');
        int lastI = n.lastIndexOf('f');

        if (firstI == -1) { // f не встречается (метод возвращает индекс первого вхождения подстроки в строку или -1.)
        } else if (firstI == lastI) { // f встречается 1 раз
            System.out.println(firstI);
        } else { // f встречается больше 1 раза
            System.out.println(firstI + " " + lastI);
        }

        scanner.close();
    }
}
