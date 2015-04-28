
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class Counts {
    public static void main(String[] args)
    {
       Scanner input = new Scanner (System.in);
        int countodd=0;
        int counteven=0;
        int countzeros=0;
        int value;
         System.out.println("Enter number");
         int num = input.nextInt();         
         while( num > 0){
            value = num % 10;
             if(num%10==0){
                 countzeros++;
             }
             else if (value%2==0){
                 counteven++;
             }
             else {
                 countodd++;
             }
               num = num / 10;
         }
         
       System.out.println("Number of Even  "+ counteven);
       System.out.println("Number of odd  "+ countodd);
       System.out.println("Number of Zer0s "+ countzeros);
              
}
    }
    
    /*
     *Enter number

 ****** 3500342
 ****** Number of Even  2
 ****  Number of odd  3
 ***** Number of Zer0s 2
     */
