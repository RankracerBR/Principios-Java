package arrays;

import java.util.Arrays;

public class arrayClassesMismatch {
    public static void main(String[] args) {
        
        int intArr[] = { 10, 20, 15, 22, 35 };

        int intArr1[] = { 10, 15, 22 };

        System.out.println("The elemento mismatched at index: "
                + Arrays.mismatch(intArr, intArr1));
    }
}
