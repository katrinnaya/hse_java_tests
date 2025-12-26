import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

class Changer {
    private boolean isFromDigitToWord;

    public Changer(boolean isFromDigitToWord) {
        this.isFromDigitToWord = isFromDigitToWord;
    }

    public String change(String n) {
        if (isFromDigitToWord) { //если передали 1 то тру
            return n.replace("0", "zero")
                    .replace("1", "one")
                    .replace("2", "two")
                    .replace("3", "three")
                    .replace("4", "four")
                    .replace("5", "five")
                    .replace("6", "six")
                    .replace("7", "seven")
                    .replace("8", "eight")
                    .replace("9", "nine");
        } else {
            return n.replace("zero", "0")
                    .replace("one", "1")
                    .replace("two", "2")
                    .replace("three", "3")
                    .replace("four", "4")
                    .replace("five", "5")
                    .replace("six", "6")
                    .replace("seven", "7")
                    .replace("eight", "8")
                    .replace("nine", "9");

        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int isFromDigitToWord = scanner.nextInt();
        scanner.nextLine(); // очистить буфер иначе читается пустая строка
        String n = scanner.nextLine();

        Changer changer = new Changer(isFromDigitToWord == 1);
        String result = changer.change(n);

        System.out.println(result);
        scanner.close();
    }
}
