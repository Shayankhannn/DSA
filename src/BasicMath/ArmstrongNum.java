package BasicMath;

import java.util.Scanner;

public class ArmstrongNum {
    // if the sum of power  of total number of digit in number
    // of each digit number is equal to the num thats called armstrong number
    // for eg num 153 - 3 digits so cube of each digit should be equal to the num -> 1^3 + 5^3 + 3^3 = 153 -> its armstrong
    // 1634 -> total number 4 so power of 4 ->  1^4 + 6^4 + 3^4 + 4^4 = 1634 armstrong number
    // Time Complexity O((log10N)^2) - manual if use in build func then O(logN)
       public static int power(int digit ,int time){
        int result = 1;
        for (int i = 0; i<time ; i++){
            result *= digit;
        }
        return result;
        }
    public static boolean isArmstrong(int N){

        int orrginalnum = N;
       int Dup = N;
       int count = 0;
       while(Dup>0){
           Dup/=10;
           count++;

       }
       int sum = 0;
       Dup = orrginalnum;
        while (Dup > 0 ){
            int ld = Dup % 10;
            sum = sum + power(ld,count);
            Dup = Dup/10;
        }
     return orrginalnum == sum;
    }

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
       int N = keyboard.nextInt();
      String isArmstrong = isArmstrong(N) ? "true" : "false" ;
      System.out.println(isArmstrong);

       }

}
