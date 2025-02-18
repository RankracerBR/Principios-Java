package arrays;

import java.util.Arrays;

public class arrayClassesFill {
    public static void main(String[] args) {
        
        int intArr[] = { 10, 20, 15, 22, 35 };

        int intKey = 22;

        Arrays.fill(intArr, intKey);

        System.out.println("Integer Array on filling: "
                            + Arrays.toString(intArr));
    }
}
