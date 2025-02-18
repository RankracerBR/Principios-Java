package arrays;

import java.util.Arrays;

public class arrayClassesSort2 {
    public static void main(String[] args) {
        
        int intArr[] = { 10, 20, 15, 22, 35 };

        Arrays.sort(intArr, 1, 3);

        System.out.println("Integer Array: "
                + Arrays.toString(intArr));
    }
}
