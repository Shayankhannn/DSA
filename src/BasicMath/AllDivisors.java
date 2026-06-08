package BasicMath;

import java.util.Scanner;

public class AllDivisors {
    public static void allDivisors(int N){
        for (int i = 1; i <=N ; i++){
            if (N%i == 0) System.out.println(i);
        }
    }
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int N = keyboard.nextInt();
        allDivisors(N);
    }
}
