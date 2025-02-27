package arrays;

import java.util.Arrays;

public class finalArray6 {
    public static void main(String[] args) {
        
        final int[] numbers = { 1, 2, 3, 4, 5 };
        

        numbers[0] = 10;

        System.out.println(
                "Array after modifying first element: "
            + Arrays.toString(numbers));
    
    }
}
