/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class TestStudent {
    public static void main(String[] args) {
        int maxsize=100;
        StudentArray stdarr = new StudentArray(maxsize);
        stdarr.insert(4534, "Fiseha", 54);
        stdarr.insert(6957, "Stella", 98);
        stdarr.insert(6745, "jenber", 45);
        stdarr.insert(3625, "Rahija", 67);
        stdarr.delete(0045);
        stdarr.find(4534).displayStudent();        
        stdarr.displayAll();
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
        stdarr.maxmark();
        System.out.println("   The maximum  mark is  " +stdarr.maxmark());
        System.out.println("**********************");
        System.out.println("   Student  Found at ID number 6745 is: ");
        stdarr.find(6745).displayStudent();
}
}
/************************************
 ******** StdID: 4534,  StdNAME: Fiseha,  Mark: 54
 *********StdID: 4534,  StdNAME: Fiseha,  Mark: 54
 ******** StdID: 6957,  StdNAME: Stella,  Mark: 98
 ******** StdID: 6745,  StdNAME: jenber,  Mark: 45
********  StdID: 3625,  StdNAME: Rahija,  Mark: 67
%%%%%%%%%%%%%%%%%%%%%%
 *******  The maximum  mark is  98
**********************
 *******  Student  Found at ID number 6745 is: 
 ******* StdID: 6745,  StdNAME: jenber,  Mark: 45
 
 * 
 */
 