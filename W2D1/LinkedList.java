
public class LinkedList {

    private Link first;            // ref to first link on list
    
    public LinkedList() // constructor
    {
        first = null;               // no links on list yet
    }

    public boolean isEmpty() // true if list is empty
    {
        return (first == null);
    }
    // -------------------------------------------------------------
    // insert at start of list

    public void insertFirst(int id, double dd) {                           // make new link
        Link newLink = new Link(id, dd);
        newLink.next = first;       // newLink --> old first
        first = newLink;            // first --> newLink
    }
    // -------------------------------------------------------------

    public Link deleteFirst() // delete first item
    {                           // (assumes list not empty)
        Link temp = first;          // save reference to link
        first = first.next;         // delete it: first-->old next
        return temp;                // return deleted link
    }
    public int size() {
        Link current = first;
        int count = 0;
        for (current = first; current != null; current = current.next) {
            count++;
        }
        return count;
    }
    public double find(double data) {
        Link current = first;              // start at 'first'
        while (current.iData != data) // while no match,
        {
            if (current.next == null) // if end of list,
            
                return 0;                 // didn't find it
             else // not end of list,
            
                current = current.next;      // go to next link
            
        }
        return current.dData;
    }
    public Link getmax() {
        Link current = first;
        Link max = first;
        for (current = first; current != null; current = current.next) {
            if (current.iData > max.iData) {
                max = current;
            }
            //return max;             
        }
        return max;
    }
    
    public Link getmin() {
        Link current = first;
        Link min = first;
        for (current = first; current != null; current = current.next) {
            if (current.iData < min.iData) {
                min = current;
            }
            //return max;             
        }
        return min;

    }
    // -------------------------------------------------------------

    public void displayList() {
        System.out.print("List (first-->last): ");
        Link current = first;       // start at beginning of list
        while (current != null) // until end of list,
        {
            current.displayLink();   // print data
            current = current.next;  // move to next link
        }
        System.out.println("  ");
    }
    // -------------------------------------------------------------
}
