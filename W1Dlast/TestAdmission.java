
import java.util.LinkedList;
import java.util.Queue;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jambo
 */
public class TestAdmission {

    public static void main(String[] args) {
        Queue<Admission> Admin = new LinkedList<Admission>();

        Admin.offer(new Admission("Alazar", "206-3873757"));
        Admin.offer(new Admission("fishika", "469-453-6126"));
        Admin.offer(new Admission("Praman", "206-346-5764"));
        Admin.offer(new Admission("Asnakech", "469-478-8764"));
        Admin.offer(new Admission("Samson", "234-567-6534"));
        Admin.isEmpty();
        System.out.println("The element at the top is : " + Admin.peek());
        for (int k = 0; k < Admin.size(); k++) {
            System.out.println("List of removed elemets are: " + Admin.remove());
        }
        System.out.println("The Size of the Queue is " + Admin.size());
    }
}
/**
 * ***************
 * /* The element at the top is : Name: Alazar Phone Number: 206-3873757
 * Admissionnumber: 565 /*List of removed elemets are: Name: Alazar Phone
 * Number: 206-3873757 Admissionnumber: 565 /*List of removed elemets are: Name:
 * fishika Phone Number: 469-453-6126 Admissionnumber: 420 /*List of removed
 * elemets are: Name: Praman Phone Number: 206-346-5764 Admissionnumber: 232 The
 * Size of the Queue is 2   
     ********************/
 
