/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class StudentArray {

    private Student[] std;
    private int size;

    public StudentArray(int max) {
        std = new Student[max];               // create the array
        size = 0;
    }

    public Student find(int searchid) {
        int i;

        for (i = 0; i < size; i++) {
            if (std[i].getid() == searchid) {
                break;
            }
        }
        if (i == size) {
            return null;
        } else {
            return std[i];
        }
    }

    public int maxmark() {
        int max = 0;
        int min;
        for (int i = 0; i < size; i++) {
            if (std[i].getmark() > max) {
                max = std[i].getmark();
            } else {
                return max;
            }
        }
        return 0;

    }

    public void insert(int id, String name, int mark) {
        if (find(id) == null) {
            std[size] = new Student(id, name, mark);
        }
        size++;                          // increment size
    }

    public boolean delete(int searchid) {                              // delete person from array
        int j;
        for (j = 0; j < size; j++) // look for it
        {
            if (std[j].equals(searchid)) {
                break;
            }
        }
        if (j == size) // can't find it
        {
            return false;
        } else // found it
        {
            for (int k = j; k < size; k++) // shift down
            {
                std[k] = std[k + 1];
            }
            size--;                       // decrement size
            return true;
        }
    }

    public void displayAll() // displays array contents
    {
        for (int j = 0; j < size; j++) // for each element,
        {
            std[j].displayStudent();          // display it
        }
    }
}
    

        
   

