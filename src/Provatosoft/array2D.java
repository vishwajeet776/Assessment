package Provatosoft;

import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int r=sc.nextInt();

        int [][] arr=new int[r][r];
        int count=1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= r; j++) {
                arr[i][j]= sc.nextInt();
            }
            System.out.println();
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= r; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}
