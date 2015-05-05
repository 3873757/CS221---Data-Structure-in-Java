/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class LinkedListApp {
    public static void main(String[] args){
        LinkedList theList = new  LinkedList();
        theList.insertFirst(20, 20.22);
        theList.insertFirst(30, 30.33);
        theList.insertFirst(40,40.44);
        theList.insertFirst(50, 50.55);
        theList.insertFirst(60, 60.66);
        theList.displayList();
        System.out.print("The Maximum Data Found is: ");
        theList.getmax().displayLink();
        System.out.println("The Minimum Data Found is: ");
        theList.getmin().displayLink();
        System.out.println("The Double data Found is : "+ theList.find(50));
        System.out.println("The Size of the List is: " +theList.size());
    
    }
    
}
/****List (first-->last): {60, 60.66} {50, 50.55} {40, 40.44} {30, 30.33} {20, 20.22}   
 ****The Maximum Data Found is: {60, 60.66} The 
 * Minimum Data Found is: {20, 20.22} 
 *** The Double data Found is : 50.55
 ***The Size of the List is: 5
 * 
 * 
 * 
 */
