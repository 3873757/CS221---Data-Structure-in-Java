
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class Character {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
          char ch = input.next().charAt(0);
          if(ch>97 &&ch<122){
              System.out.println("lowercase");
          }
          else if (ch>64&&ch<90){
              System.out.println("Uppercase");              
          }
          else if(ch>32&&ch<48){
              System.out.println("special character");
          }
         else if(ch>48&&ch<58){
             System.out.println("Number");
         }
              
    }
    
    }
   /*  OUTPUTS
 H
 Uppercase
 /
 special character
 23
 Number
 */

