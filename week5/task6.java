import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

class Nikola {
    private String name;
    private int age;
    
    public Nikola(String name, int age) {  
        if (name.equals("Николай")) {
            this.name = name;            
        } else {
            this.name = "я не " + name + ", а Николай";
        }
        this.age = age;       
    }
    public void printInfo() {
        System.out.println("Имя: " + name + ", возраст: " + age);
    }
}   
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        
        Nikola nikola = new Nikola(name, age);
        nikola.printInfo();
        
        scanner.close();
    }
}
