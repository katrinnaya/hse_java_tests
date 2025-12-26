import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = Integer.parseInt(scanner.nextLine()); // размер массива
        
        Integer[] array = new Integer[n]; // n целых чисел — элементы массива (может быть “null”)
        
        String[] elements = scanner.nextLine().split(" "); // проще читать как строку, чтобы поймать нулл и потом преобразовать 
        for (int i = 0; i < n; i++) {
            array[i] = elements[i].equals("null") ? null : Integer.parseInt(elements[i]); // если элемент массива=нулл, то запись null, иначе преобразование в число
        }
        
        int m = Integer.parseInt(scanner.nextLine()); // количество команд
        
        for (int i = 0; i < m; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String command = parts[0]; // GET(), SET()(), DIV()

    // •	GET index — получить элемент по индексу
	// •	SET index value — установить значение по индексу
	// •	DIV index divisor — разделить элемент по индексу на divisor
            
            try { // закрыть catch для обработки эксепшенов 
                switch (command) {
                    case "GET":
                        int getIndex = Integer.parseInt(parts[1]); // парсим индекс 
                        Integer getValue = array[getIndex]; 
                      //  int getResult = getValue; убрала тк если нулл - то экспешн и нулл не выводит как найденый элемент 
                        System.out.println(getValue);
                        break;
                        
                    case "SET":
                        int setIndex = Integer.parseInt(parts[1]); // индекс 
                        int setValue = Integer.parseInt(parts[2]); // значение 
                        array[setIndex] = setValue;
                        System.out.println("OK"); // выведет если не было эксепшена 
                        break;
                        
                    case "DIV":
                        int divIndex = Integer.parseInt(parts[1]); // индекс 
                        int divisor = Integer.parseInt(parts[2]); // делитель 
                        Integer element = array[divIndex];
                        int value = element;
                        int divResult = value / divisor;
                        array[divIndex] = divResult; // сохраняем результат в массив, а не просто выводим 
                        System.out.println(divResult);
                        break;
                }
	// •	ArrayIndexOutOfBoundsException — неверный индекс
	// •	ArithmeticException — деление на ноль
	// •	NullPointerException — элемент равен null

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBounds");
            } catch (NullPointerException e) {
                System.out.println("NullPointer");
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException");
            }
        }
        
        scanner.close();
    }
}
