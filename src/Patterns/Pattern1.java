package Patterns;

import java.util.Scanner;

// 4x4 star pattern
//****
//****
//****
//****
public class Pattern1 {
    public static void pattern1(int n){
        for (int i = 0 ; i<4;i++) {
            for (int j = 0; j < 4; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    public static void main(String[] args){
        int t;
        Scanner keyboard = new Scanner(System.in);
        t = keyboard.nextInt();
        int n;
        for (int i = 0; i < t; i++){
            n = keyboard.nextInt();
            pattern1(n);
        }
    }
}
