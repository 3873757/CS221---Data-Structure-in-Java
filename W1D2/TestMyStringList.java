/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class TestMyStringList {
    public static void main (String[] args){
        MyStringList obj = new MyStringList();
           obj.add("DataStructure");
           obj.insert("Algorithm", 3);
           obj.get(2);
           obj.remove("DataStructure");
           obj.size();           
           obj.find("Algorithm");
           obj.display();
           System.out.println("the size of the array string is:" + obj.size());
           obj.display();
           System.out.println("the string at index 2 is "+obj.get(3) );
           System.out.println("the string found is :"+obj.find("Algorithm"));
          
    }
}
/* ********OUTPUTS*****************
      the size of the array string is:0
      the string at index 2 is null
      the string found is : false  
 */