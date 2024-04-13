import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class LargestNumber {
    public static int largestNumber(List<Integer> numbers) {
        Collections.sort(numbers, Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        for (Integer num : numbers) {
            result.append(num);
        }
        return Integer.parseInt(result.toString());
    }
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 6, 7, 8, 9);
        int output = largestNumber(numbers);
        System.out.println(output);
    }
}

