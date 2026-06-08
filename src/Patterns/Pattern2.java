package Patterns;

import java.util.Scanner;

/*
this pattern :
 *
 **
 ***
 ****

 */
public class Pattern2 {
    public static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int t;
        Scanner keyboard = new Scanner(System.in);
        t = keyboard.nextInt();
        int n;
        for (int i = 0; i < t; i++){
            n = keyboard.nextInt();
            pattern2(n);
    }
    }
}