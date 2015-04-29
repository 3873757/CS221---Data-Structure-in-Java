/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class MyStringList {

    private final int INITIAL_LENGTH = 4;
    private String[] strArray = new String[4];
    private int size;

    public MyStringList() {
        strArray = new String[4];
        size = 0;
    }

    private void resize() {
        System.out.println("resizing");
        int size = strArray.length;
        int newsize = 2 * size;
    }

    public void add(String str) {
        if (size == strArray.length) {
            resize();
            strArray[4] = str;
            size++;
        }
    }

    public String get(int i) {
        if (i < size) {
            return strArray[i];
        }
        return null;
    }

    public boolean find(String str) {
        boolean stringInArray = false;

        for (int i = 0; i < size; i++) {

            if (strArray[i] == str) {

                stringInArray = true;
                break;
            }
        }

        return stringInArray;
    }

    public void insert(String str, int pos) {
        if (pos > size) {
            return;
        }
        if (pos >= strArray.length || size + 1 > strArray.length) {
            resize();
        }
        String[] temp = new String[strArray.length + 1];
        System.arraycopy(strArray, 0, temp, 0, pos);
        temp[pos] = str;

        System.arraycopy(strArray, pos, temp, pos + 1, strArray.length - pos);
        strArray = temp;
        ++size;

    }
    public boolean remove(String str) {

        {
            int i;
            for (i = 0; i < size; i++) // look for it
            {
                if (str == strArray[i]) {
                    break;
                }
            }
            if (i == size) // can't find it
            {
                return false;
            } else // found it
            {
                for (int k = i; k < size; k++) // move higher ones down
                {
                    strArray[k] = strArray[k + 1];
                }
                size--;                   // decrement size
                return true;
            }
        }
    }

    public int size() {
        return size;
    }

    public void display() // displays array contents
    {
        
        for (int i = 0; i < size; i++) // for each element,
        {
            System.out.print(strArray[i] + " ");  // display it
        }
        System.out.println("");
    }
}

