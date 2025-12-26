import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

class Pupil {
    private String name;
    private int[][] marks;

    public Pupil(String name, int[][] marks) {
        this.name = name;
        this.marks = marks;
    }

    public double getMark(int quarter) { // возвращает среднюю оценку ученика за четверть
        int[] quarterMarks = marks[quarter - 1]; // -1 тк массив идет с 0 а четверть с 1
        int sum = 0;
        for (int mark : quarterMarks) {
            sum += mark;
        }
        double average = (double) sum / quarterMarks.length;
        return Math.round(average * 10) / 10.0; // Дробную часть числа округлять до 1 знака после запятой
    }

    public double getMark() { // возвращает среднюю оценку ученика за все время
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += getMark(i + 1); // чтобы получить номер четверти +1 к индексу. используем предыдущий метод
        }
        return Math.round(sum / marks.length * 10) / 10.0; // Дробную часть числа округлять до 1 знака после запятой
    }

    public String getInfo() { // возвращает строку с информацией об ученике (без переопределения чтобы не запутаться)
        String result = "I: " + getMark(1) + "\n" +
                "II: " + getMark(2) + "\n" +
                "III: " + getMark(3) + "\n" +
                "IV: " + getMark(4) + "\n" +
                "Total for " + name + ": " + getMark();
        return result.replace('.', ','); // чтобы в выводе были запятые
    }

}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int[][] marks = new int[4][]; // сразу задаем размерность тк черверти 4

        for (int i = 0; i < 4; i++) {
            String lineMraks = scanner.nextLine(); // строка с оценками в черверти
            String[] marksStr = lineMraks.split(" "); // разделяем по пробелу на отдельные оценки

            marks[i] = new int[marksStr.length]; // массив для оценок в черверти
            for (int j = 0; j < marksStr.length; j++) {
                marks[i][j] = Integer.parseInt(marksStr[j]); // преобразуем строку в число
            }
        }

        Pupil pupil = new Pupil(name, marks);
        System.out.println(pupil.getInfo());

        scanner.close();
    }
}
