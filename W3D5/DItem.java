
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DItem {

    private String sData;
//int count;// data item (key)
//--------------------------------------------------------------
    public DItem(String ii) // constructor
    {
        sData = ii;
    }
//--------------------------------------------------------------
    public String getKey() 
    {
        return sData;
    }
//--------------------------------------------------------------
}  // end class DataItem
////////////////////////////////////////////////////////////////
class HashTable {

    int count = 0;
    private DItem[] hashArray;    // array holds hash table
    private int arraySize;
    private DItem nonItem;        // for deleted items
//-------------------------------------------------------------
    public HashTable(int size) // constructor
    {

        arraySize = size;
        hashArray = new DItem[arraySize];
        nonItem = new DItem(" null ");   // deleted item key is -1//dosomehing
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
//public int hashFunc(int key)
//   {
//   return key % arraySize;       // hash function
//   }
//-------------------------------------------------------------
    public void insert(DItem item) // insert a DataItem
    // (assumes table not full)
    {
        // count=0;
        String key = item.getKey();
        int temp = Math.abs(key.hashCode());// extract key
        int hashVal = temp % arraySize;  // hash the key
        // until empty cell or -1,
        while (hashArray[hashVal] != null
                && hashArray[hashVal].getKey() != " null") {
            ++hashVal;                 // go to next cell
            hashVal %= arraySize;      // wraparound if necessary
        }
        hashArray[hashVal] = item;
        count++;// insert item
    }  // end insert()
//-------------------------------------------------------------
    public DItem delete(String key) // delete a DataItem
    {
        int temp = Math.abs(key.hashCode());// extract key
        int hashVal = temp % arraySize;  // hash the key

        while (hashArray[hashVal] != null) // until empty cell,
        {                               // found the key?
            if (hashArray[hashVal].getKey().equals(key)) {
                DItem temp1 = hashArray[hashVal]; // save item
                hashArray[hashVal] = nonItem;
                count--;// delete item
                return temp1;                        // return item
            }
            ++hashVal;                 // go to next cell
            hashVal %= arraySize;      // wraparound if necessary
        }
        return null;                  // can't find item
    }  // end delete()
//-------------------------------------------------------------
    public DItem find(String key) // find item with key
    {
        int temp = Math.abs(key.hashCode());// extract key
        int hashVal = temp % arraySize;  // hash the key

        while (hashArray[hashVal] != null) // until empty cell,
        {                               // found the key?
            if (hashArray[hashVal].getKey() == key) {
                return hashArray[hashVal];   // yes, return item
            }
            ++hashVal;                 // go to next cell
            hashVal %= arraySize;      // wraparound if necessary
        }
        return null;                  // can't find item
    }

    public int getSize() {
        return count;
    }
}

class HashTableApp {

    private static int nIemt;

    public static void main(String[] args) throws IOException {
        DItem aDataItem;
        int size, n, keysPerCell;
        String aKey;
        int ct;
        // get sizes
        System.out.print("Enter size of hash table: ");
        size = getInt();
//   System.out.print("Enter initial number of items: ");
//   n = getInt();
        keysPerCell = 10;
        // make table
        HashTable theHashTable = new HashTable(size);

//   for(int j=0; j<n; j++)        // insert data
//      {
//      aKey = (int)(java.lang.Math.random() *
//                                      keysPerCell * size);
//      aDataItem = new DItem(aKey);
//      theHashTable.insert(aDataItem);
//      }

        while (true) // interact with user
        {
            System.out.print("Enter first letter of ");
            System.out.print("show, insert, delete, or find: ");
            char choice = getChar();
            switch (choice) {
                case 's':
                    theHashTable.displayTable();
                    break;
                case 'i':
                    System.out.print("Enter key value to insert: ");
                    aKey = getstring();
                    aDataItem = new DItem(aKey);
                    theHashTable.insert(aDataItem);
                    break;
                case 'd':
                    System.out.print("Enter key value to delete: ");
                    aKey = getstring();
                    theHashTable.delete(aKey);
                    break;
                case 'n':
                    ct = theHashTable.getSize();
                    System.out.println("the number object hash table is  :  " + ct);
                    break;
                case 'f':
                    System.out.print("Enter key value to find: ");
                    aKey = getstring();
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
        }  // end while
    }  // end main()
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

    public static String getstring() throws IOException {
        String s = getString();
        return s;
    }

    public static int getsize() {
        int item = getsize();
        return nIemt;

    }
}
/*
 * run:
Enter size of hash table: 10
Enter first letter of show, insert, delete, or find: i
Enter key value to insert: "java"
Enter first letter of show, insert, delete, or find: i
Enter key value to insert: "datastructure"
Enter first letter of show, insert, delete, or find: i
Enter key value to insert: "Algorith"
Enter first letter of show, insert, delete, or find: "C#"
Invalid entry
Enter first letter of show, insert, delete, or find: i
Enter key value to insert: "C#"
Enter first letter of show, insert, delete, or find: s
Table: "Algorith" "C#" ** ** ** "datastructure" "java" ** ** ** 
Enter first letter of show, insert, delete, or find: n
the number object hash table is  :  4
Enter first letter of show, insert, delete, or find: d
Enter key value to delete: "C#"
Enter first letter of show, insert, delete, or find: s
Table: "Algorith"  null  ** ** ** "datastructure" "java" ** ** ** 
Enter first letter of show, insert, delete, or find: n
the number object hash table is  :  3
Enter first letter of show, insert, delete, or find: 
 * 
 * 
 */
