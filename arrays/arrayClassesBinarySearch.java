package arrays;

import java.util.Arrays;

class Main{
    public static void main(String[] args) {

        int intArr[] = { 10, 20, 15, 22, 35 };

        Arrays.sort(intArr);

        int intKey = 22;

        System.out.println(intKey + " found at index = "
                + Arrays.binarySearch(intArr, intKey));
                          
        System.out.println(intKey + "  found at index = "
                            + Arrays.binarySearch(intArr, 1, 3, intKey));
    }
}