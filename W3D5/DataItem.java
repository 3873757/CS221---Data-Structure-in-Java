
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataItem {

    private int iData;
    int nItem;// data item (key)

    public DataItem(int ii) {
        iData = ii;
        nItem = 0;
    }

    public int getKey() {
        return iData;
    }
}

class HashTable {

    int nItem;
    int Step;
    private DataItem[] hashArray;    // array holds hash table
    private int arraySize;
    private DataItem nonItem;        // for deleted items
//-------------------------------------------------------------
    public HashTable(int size) // constructor
    {
        arraySize = size;
        hashArray = new DataItem[arraySize];
        nonItem = new DataItem(-1);   // deleted item key is -1
    }
//-------------------------------------------------------------
    public void displayTable() {
        System.out.print("Table: ");
        for (int j = 0; j < arraySize; j++) {
            if (hashArray[j] != null) {
                System.out.print(hashArray[j].getKey() + " ");
            } else {
                System.out.print("** ");
            }
        }
        System.out.println("");
    }
//-------------------------------------------------------------
    public int hashFunc(int key) {
        return key % arraySize;       // hash function
    }
//-------------------------------------------------------------
    public void insert(DataItem item) // insert a DataItem
    // (assumes table not full)
    {

        Step = 1;
        int key = item.getKey();      // extract key
        int hashVal = hashFunc(key);  // hash the key
        // until empty cell or -1,
        while (hashArray[hashVal] != null
                && hashArray[hashVal].getKey() != -1) {
            hashVal = (hashVal + Step * Step);                 // go to next cell
            hashVal %= arraySize;
            Step++;
            System.out.println("Find the vacant in index : " + hashVal);// wraparound if necessary
        }
        hashArray[hashVal] = item;
        nItem++;
        // insert item

    }  // end insert()
//-------------------------------------------------------------
    public DataItem delete(int key) // delete a DataItem
    {
        Step = 1;
        int hashVal = hashFunc(key);  // hash the key

        while (hashArray[hashVal] != null) // until empty cell,
        {                               // found the key?
            if (hashArray[hashVal].getKey() == key) {
                DataItem temp = hashArray[hashVal]; // save item
                hashArray[hashVal] = nonItem;
                nItem--;// delete item
                return temp;                        // return item
            }
            hashVal = (hashVal + Step * Step);                 // go to next cell
            hashVal %= arraySize;      // wraparound if necessary
        }
        return null;                  // can't find item
    }  // end delete()
//-------------------------------------------------------------
    public DataItem find(int key) // find item with key
    {
        int hashVal = hashFunc(key);  // hash the key

        while (hashArray[hashVal] != null) // until empty cell,
        {                               // found the key?
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];   // yes, return item
            }
            hashVal = (hashVal + Step * Step);                 // go to next cell
            hashVal %= arraySize;      // wraparound if necessary
        }
        return null;                  // can't find item
    }

    public int getSize() {
        return nItem;
    }
//-------------------------------------------------------------
}  // end class HashTable

//--------------------------------------------------------------
////////////////////////////////////////////////////////////////
class HashTableApp {

    private static int nIm;

    public static void main(String[] args) throws IOException {
        DataItem aDataItem;
        int aKey, size, n, nItem, keysPerCell;
        // get sizes
        System.out.print("Enter size of hash table: ");
        size = getInt();
        System.out.print("Enter initial number of items: ");
        n = getInt();
        //System.out.println("Number of elemet is");
        //nIm=getSize()();
        keysPerCell = 10;
        // make table
        HashTable theHashTable = new HashTable(size);

        for (int j = 0; j < n; j++) // insert data
        {
            aKey = (int) (java.lang.Math.random()
                    * keysPerCell * size);
            aDataItem = new DataItem(aKey);
            theHashTable.insert(aDataItem);
        }

        while (true) // interact with user
        {
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, delete,numofitems or find: ");
            char choice = getChar();
            switch (choice) {
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    aKey = getInt();
                    aDataItem = new DataItem(aKey);
                    theHashTable.insert(aDataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = getInt();
                    theHashTable.delete(aKey);
                    break;
                case 'n':
                    aKey = theHashTable.getSize();
                    System.out.println("T size of the hash table is  :  " + aKey);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = getInt();
                    aDataItem = theHashTable.find(aKey);
                    if (aDataItem != null) {
                        System.out.println("Found " + aKey);
                    } else {
                        System.out.println("Could not find " + aKey);
                    }
                    break;
                default:
                    System.out.print("Invalid entry\n");
            }  // end switch
        }
        // end while
    }
//--------------------------------------------------------------
    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }
//--------------------------------------------------------------
    public static char getChar() throws IOException {
        String s = getString();
        return s.charAt(0);
    }
//-------------------------------------------------------------
    public static int getInt() throws IOException {
        String s = getString();
        return Integer.parseInt(s);
    }

    public static int getsize() {
        int item = getsize();
        return nIm;

    }
}
/*
 * **************************************************************
 **********Enter size of hash table: 12
 **********Enter initial number of items: 8
 **********Find the vacant in index : 8
 **********Find the vacant in index : 9
 **********Find the vacant in index : 9
 **********Find the vacant in index : 1
 **********Find the vacant in index : 10
 **********Find the vacant in index : 2
 **********Find the vacant in index : 3
 **********Enter first letter of show, insert, delete,numofitems or find: s
 **********Table: ** 37 38 116 ** ** 102 7 79 8 94 ** 
 **********Enter first letter of show, insert, delete,numofitems or find: i
 **********Enter key value to insert: 34
 **********Find the vacant in index : 11
 **********Enter first letter of show, insert, delete,numofitems or find: sh
 **********Table: ** 37 38 116 ** ** 102 7 79 8 94 34 
 **********Enter first letter of show, insert, delete,numofitems or find: d
 **********Enter key value to delete: 32
 **********Enter first letter of show, insert, delete,numofitems or find: n
 **********T size of the hash table is  :  9
 **********Enter first letter of show, insert, delete,numofitems or find: i
 **********Enter key value to insert: 19
 **********Find the vacant in index : 8
 **********Find the vacant in index : 0
 **********Enter first letter of show, insert, delete,numofitems or find: s
 **********Table: 19 37 38 116 ** ** 102 7 79 8 94 34 
 **********Enter first letter of show, insert, delete,numofitems or find: n
 **********T size of the hash table is  :  10
 **********Enter first letter of show, insert, delete,numofitems or find: d
 ********* Enter key value to delete: 79
 **********Enter first letter of show, insert, delete,numofitems or find: d
 *********Enter key value to delete: 34
 ********  Enter first letter of show, insert, delete,numofitems or find: n
 ********* T size of the hash table is  :  8
 **********Enter first letter of show, insert, delete,numofitems or find:  
 * 
 ***************************************************************
 */
