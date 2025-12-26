import java.util.Scanner;
// import java.util.regex.Pattern;
// import java.util.regex.Matcher;

class Student {
    private String name;
    private String roomNumber;
    
    public Student(String name, String roomNumber) {  
        this.name = name;
        this.roomNumber = roomNumber;

    }   
    public void printInfo() {
        System.out.println(("Имя: " + name + ", номер комнаты: " + roomNumber));
       
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            String roomNumber = scanner.next();
            students[i] = new Student(name, roomNumber);
        } 

        for (int i = 0; i < n; i++) {
            students[i].printInfo(); 
        }       
        
        scanner.close();
    }
}
