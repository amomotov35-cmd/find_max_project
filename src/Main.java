import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static Integer findMaximum(List<Integer> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return null;
        }
        
        Integer max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Программа поиска максимума ===");
        System.out.print("Введите количество элементов: ");
        int count = scanner.nextInt();
        
        if (count <= 0) {
            System.out.println("Количество элементов должно быть больше 0!");
            scanner.close();
            return;
        }
        
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Введите " + count + " чисел:");
        
        for (int i = 0; i < count; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            numbers.add(scanner.nextInt());
        }
        
        Integer maxValue = findMaximum(numbers);
        
        if (maxValue != null) {
            System.out.println("\nВведенные числа: " + numbers);
            System.out.println("Максимальное значение: " + maxValue);
        } else {
            System.out.println("Не удалось найти максимальное значение.");
        }
        
        scanner.close();
    }
}