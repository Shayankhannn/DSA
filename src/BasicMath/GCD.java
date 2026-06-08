package BasicMath;

import java.util.Scanner;

public class GCD {
    // using euclidean algo
    // time complexity is O (log (min of a and b ))
    public static int gcd(int a , int b){
        while (a>0 && b>0){
            if (a>b)
                a = a%b;
            else
                b = b%a;
        }
        if (a == 0)
            return b ;
        else return a;
    }
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int a,b;
        a= keyboard.nextInt();
        b= keyboard.nextInt();
        gcd(a,b);
    }
}
