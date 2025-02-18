package arrays;

import java.util.Arrays;

public class arrayClassesStream {
    public static void main(String[] args) {

        int intArr[] = { 10, 20, 15, 22, 35 };

        System.out.println("Integer Array: "
                            + Arrays.stream(intArr));          
    }
}
