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
         
   




