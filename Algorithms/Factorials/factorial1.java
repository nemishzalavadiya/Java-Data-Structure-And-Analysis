/**
 * @type - Recursive Factorial Algorithm
 */

import java.util.Scanner;
public class factorial1{


        public static int fact(int n){
            if(n==1){
                return 1;
            }
            return n*fact(n-1);
        }

        public static void main(String arg[]){
            Scanner sc = new Scanner(System.in);
            System.out.println(factorial1.fact(sc.nextInt()));  
            sc.close(); 
        }

}