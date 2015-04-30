
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class TestLibrary {
    public static void main(String[] args){
       
        ArrayList<Library> library = new ArrayList<>();
        library.add(new Library(453, "JA3645463P", "JAVA", 405));
        library.add(new Library(0043, "JA3645432657R", "JAVA", 85));
        library.add(new Library(40503, "DS3098463R", "Algorith ", 150));
        library.add(new Library(0032, "DS3645432657S", "DataStructure 6.0", 185));
        library.add(new Library(543, "Js3645463pp", "DATASTRUCTURE ", 545));
        library.add(new Library(060, "3645432657R", "Algorithm 2.0", 85));
        library.add(new Library(6543, "OS3098463R", "JAVA", 105));
        library.add(new Library(053, "DB3645432657S", "Database", 453));
        Library lib = library.get(3);
        library.remove(4);
        library.remove(2);
        library.size();
        System.out.println("Is the Array empty? " + library.isEmpty());
        //library.isEmpty();
        System.out.println(library.contains("Database"));
        int totalcost = 0;
        for (Library libc : library) {
            if (libc.getBookName().equals("JAVA")) {
                totalcost += libc.getPrice();
            }
        }
        System.out.println("The total cost of java book is:" + totalcost);
        System.out.println("The Book found at index three is: ");
                          library.get(3).displayLibrary();
    }
}
/*OUTPUT***********************
 * Is the Array empty? false
false
The total cost of java book is:595
The Book found at index three is: 
BookID: 0, Price: 85.0, BookNAME: Algorithm 2.0
 * 
 * 
 * 
 * 
 */