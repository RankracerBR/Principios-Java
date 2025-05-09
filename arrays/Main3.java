package arrays;

import java.util.stream.IntStream;

public class Main3 {
    public static void main(String[] args){

        int[] arr1 = IntStream.range(1, 5).toArray();
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i] + " ");
        }

        System.out.print('\n');

        int[] arr2 = IntStream.rangeClosed(1, 4).toArray();
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }

        System.out.println('\n');
        
        int[] arr3 = IntStream.of(1, 2, 3, 4).toArray();
        for (int i= 0; i < arr3.length; i++){
            System.out.println(arr3[i] + " ");
        }    
    }
}
