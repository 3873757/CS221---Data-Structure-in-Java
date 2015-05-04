
import java.util.LinkedList;
import java.util.Queue;

public class Admission {

    private int adno; // Admission number 
    private String name; // Name of the student
    private String pno;
    // private Admission[] Admin;

    public Admission(String name, String pno) {
        this.adno = (int) (Math.random() * 1000);
        this.name = name;
        this.pno = pno;
    }

    public String toString() {
        return ("Name:  " + name + " Phone Number: " + pno + " Admissionnumber:  " + adno);
    }
    public boolean IsEmpty(){
        return false;
        
    }
}
