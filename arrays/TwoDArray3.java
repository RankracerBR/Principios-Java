package arrays;

import java.util.Scanner;

public class TwoDArray3{
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter number of columns: ");
            int row = scn.nextInt();

        System.out.print("Enter number of columns: ");
        int col = scn.nextInt();

        int[][] arr = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        scn.close();

    }
}