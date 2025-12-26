import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

class Soda {
    private String add;
    
    public Soda(String add) { // констурктор с добавкой 
        this.add = add;
    }
    
    public void showMyDrink() {
        if (add != null && add.matches("^[a-zA-Zа-яА-Я]+$")) { // строка не пустая и состоит только из букв
            System.out.println("Газировка со вкусом \"" + add + "\"");
        } else {
            System.out.println("Обычная газировка");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        
        Soda soda = new Soda(n);
        soda.showMyDrink();
        
        scanner.close();
    }
}
