package BasicMath;

import java.util.Scanner;

public class CheckPrime {
    public static void isPrime(int N){
      int  count= 0;
        for(int i=1;i*i<=N;i++){
            if (N%i==0){
             count++;
             if (N/i != i){
                 count++;
             }

            }
        }
        if (count == 2){
            System.out.println("true");
        }else {
            System.out.println("false");

        }
    }
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        int N = keyboard.nextInt();
        isPrime(N);
        if (N%N == 0 && N%1==N) System.out.println("this method work too");
    }
}
