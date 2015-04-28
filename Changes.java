
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class Changes {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
         double dollar = input.nextDouble();
         double total= dollar*100;
         double once = (int)(total/100);
         double quarters = (int)(total-once*100)/25;
         double dimes = (int)(total-(once*100+quarters*25))/10;
         double nickel = (int)(total-(once*100+quarters*25+dimes*10))/5;
         double pennis = (int)total-(once*100+quarters*25+dimes*10+nickel*5);
         
         System.out.println(once +" dollars");
         System.out.println(quarters +" quarters");  
         System.out.println(dimes+"Dimes");
         System.out.println(nickel +" Nickels");
         System.out.println(pennis +" pennis");
         
         /*  OUTPUTS ********
         Amount entered 3435.43

         3435.0 dollars
         1.0 quarters
         1.0Dimes
         1.0 Nickels
         3.0 pennis
          */
         
    }
}
