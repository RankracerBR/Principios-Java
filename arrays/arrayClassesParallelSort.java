package arrays;

import java.util.Arrays;

public class arrayClassesParallelSort {
    public static void main(String[] args) {
        
        int intArr[] = { 10, 20, 15, 22, 35 };

        Arrays.parallelSort(intArr);

        System.out.println("Integer Array: "
                + Arrays.toString(intArr));
    }
}
