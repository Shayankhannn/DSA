package Patterns;

import java.util.Scanner;

/*
this pattern :
*****
****
***
**
*

 */
public class Pattern5 {
    public static void pattern5(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--)
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
            pattern5(n);
        }
    }
}