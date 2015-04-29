/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class GenerateNums {

    public static void main(String[] args ) {
                     
       

        GeneratArray Ga = new  GeneratArray();
        Ga.Generaterandom();
        Ga.printArray();
        System.out.println("Value at Index(3) : " + Ga.get(3));
        Ga.removeduplicat();
        System.out.println("After removing depulication! ");
        Ga.printArray();
    }
}
         
   /*OUTPUT*******************
    * *50, 10, 9, 59, 14, 3, 61, 93, 41, 0, 31, 78, 60, 78, 3, 88, 34, 84, 88, 53, 39, 90, 19, 63, 98, 16, 67, 44, 3, 1, 56, 66, 48, 12, 32, 58, 76, 33, 74, 12, 1, 35, 26, 10, 99, 44, 8, 94, 40, 21, Value at Index(3) : 59
     After removing depulication! 
     10, 59, 3, 93, 0, 78, 88, 84, 39, 19, 98, 67, 1, 66, 12, 58, 33, 35, 99, 8, 40
    * *
    * *
    */




