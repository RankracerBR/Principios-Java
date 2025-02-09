package arrays;

public class array {
    public static void main(String[] args){
        int[] arr = { 1, 2, 3, 4, 5};

        int n = arr.length;

        for (int i= 0; i < n; i++){
            System.out.print(arr[i] + "");
        }
    }
}


class GFC {
    public static void main(String[] args) {
        int[] arr;

        arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        for (int i = 0; i < arr.length; i++){
            System.out.println("Element at index " + i + " : " + arr[i]); 
        }
    }
}