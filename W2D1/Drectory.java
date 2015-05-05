/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class Drectory 
{
    String name;
    long pno; // Phone number
    Drectory next;

    public Drectory(String name, long pno) 
    {
        this.name = name;
        this.pno = pno;
    }
    public void displayDer() {
        System.out.print(name + "  " + " " + pno + " ");
    }
}
