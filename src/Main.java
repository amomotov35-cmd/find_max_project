import java.util.ArrayList; 
import java.util.List; 
import java.util.Scanner; 
 
public class Main { 
    public static Integer findMinimum(List<Integer> numbers) { 
            return null; 
        } 
 
        Integer min = numbers.get(0); 
        for (int i = 1; i < numbers.size(); i++) { 
            if (numbers.get(i) < min) { 
                min = numbers.get(i); 
            } 
        } 
        return min; 
    } 
 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
 
        System.out.println("=== Программа поиска минимума ==="); 
        System.out.print("Введите количество элементов: "); 
        int count = scanner.nextInt(); 
 
        if (count <= 0) { 
            System.out.println("Количество элементов должно быть больше 0!"); 
            scanner.close(); 
            return; 
        } 
        List<Integer> numbers = new ArrayList<>(); 
        System.out.println("Введите" + count + " чисел:"); 
 
        for (int i = 0; i < count; i++) { 
            System.out.print("Элемент" + (i + 1) + ": "); 
            numbers.add(scanner.nextInt()); 
        } 
 
        Integer minValue = findMinimum(numbers); 
 
        if (minValue != null) { 
            System.out.println("\nВведенные числа: " + numbers); 
            System.out.println("Минимальное значение: " + minValue); 
            System.out.println("Не удалось найти минимальное значение."); 
        } 
 
        scanner.close(); 
    } 
} 
