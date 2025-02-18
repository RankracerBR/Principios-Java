package arrays;

import java.util.Arrays;

public class arrayClassesCopyOfRange {
    public static void main(String[] args) {
        
        int intArr[] = { 10, 20, 15, 22, 35 };

        System.out.println("Integer Array: "
                + Arrays.toString(intArr));
                            
        System.out.println("\n Arrays by copyOfRange: ");

        System.out.println("Integer Array: "
                + Arrays.toString(Arrays.copyOfRange(intArr, 1, 3)));
    }  
}

