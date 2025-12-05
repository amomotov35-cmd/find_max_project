import java.util.Arrays;
import java.util.List;

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
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9, 3);
        Integer result = findMaximum(numbers);
        System.out.println("Максимальное значение: " + result);
    }
}