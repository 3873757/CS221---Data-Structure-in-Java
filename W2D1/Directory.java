

public class Directory{
    private Drectory first; // ref to first Directory
    private Drectory last;
   // private Drectory  next;       
    public Directory() 
	{
        first =null;
        last =null;
	}
    public boolean isEmpty() // true if list is empty
    {
        if (first == null && last == null) {
            }
        return false;
    }
    public void insertfirst(String name, long pno) {
        Drectory direct = new Drectory(name,pno);
        if (isEmpty()) {
            last = direct;
        }
        direct.next = first;
        first = direct;
    }
    public void insertlast(String name, long pno) // insert at end of list
    {
        Drectory direct = new Drectory(name, pno);   // make new link
        if (isEmpty()) {
            first = direct;
        } else {
            // last.next=direct;
             direct.next=null;
        }
        last = direct;
    }
    public Drectory deletefirst(String name,long pno) {
        Drectory  temp = first.next;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;        
        }
    public void displaydir() {
        System.out.print("List  ");
        Drectory current = first;
        while (current != null) {
            current.displayDer();
            current = current.next;
        }
        System.out.println(" ");
    }
}