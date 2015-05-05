/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class DirectoryApp 
{
    public static void main(String[] args)
    {
        Directory direc = new Directory();
        direc.insertfirst("Akaki", 325876543);
        direc.insertfirst("fredrick",  325765443);
        direc.insertfirst("fishika",2064567432);
        direc.insertfirst("Corral",345876123);        
        direc.insertlast("melodia",461234765);
        direc.insertlast("Sanches",897632534);
        direc.insertlast("treavers",435365218);
        direc.insertlast("Andrewu", 743983453);
        direc.displaydir();
        direc.deletefirst("melodia", 461234765);
        System.out.println("Lists After deletion");
        direc.displaydir();            
    }
    }

/*
 *List  Corral   345876123 fishika   2064567432 fredrick   325765443 Akaki   325876543  
  Lists After deletion
  List  fishika   2064567432 fredrick   325765443 Akaki   325876543 
 * 
 * 
 * 
 */