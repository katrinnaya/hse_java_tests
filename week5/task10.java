import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

class TriangleChecker {
    private double a;
    private double b;
    private double c;
    
    public TriangleChecker(double a, double b, double c) {  
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void isTriangle() {
        if (a <= 0 || b <= 0 || c <= 0) { // отриц или ноль (те просто точка)
            System.out.println("С отрицательными числами ничего не выйдет!");           
        } else if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Ура, можно построить треугольник!");
        } else {
            System.out.println("Жаль, но из этого треугольник не сделать");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        
        TriangleChecker triangle = new TriangleChecker (a, b, c);
        triangle.isTriangle();
        
        scanner.close();
    }
}
