
public class DELinkedListGeneric<T> {

    public T dData;
    public DELinkedListGeneric next;

    public DELinkedListGeneric(T d) {
        dData = d;
    }

    public void displayLink() {
        System.out.print(dData + " ");
    }
}

class FirstLastList<T> {

    private DELinkedListGeneric first;
    private DELinkedListGeneric last;

    public FirstLastList() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(T dd) {
        DELinkedListGeneric newLink = new DELinkedListGeneric(dd);

        if (isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(T dd) {
        DELinkedListGeneric newLink = new DELinkedListGeneric(dd);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public T deleteFirst() {
        T temp = (T) first.dData;
        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList() {
        System.out.print("List (first-->last): ");
        DELinkedListGeneric current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}

class FirstLastApp {

    public static void main(String[] args) {
        FirstLastList<Integer> theList = new FirstLastList<Integer>();

        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);

        theList.insertLast(11);
        theList.insertLast(33);
        theList.insertLast(55);

        FirstLastList<String> theList1 = new FirstLastList<String>();
        theList1.insertFirst("Java");
        theList1.insertLast("C++");
        theList1.insertFirst("DotNet");
        theList1.insertLast("C#");
        FirstLastList<Object> theList2 = new FirstLastList<Object>();
        theList2.insertFirst("A");
        theList2.insertLast(12);
        theList2.insertFirst("Algorith");
        theList.displayList();

        theList1.displayList();
        theList2.displayList();
    }
}
/***List (first-->last): 66 44 22 11 33 55 
****List (first-->last): DotNet Java C++ C# 
***List (first-->last): Algorith A 12 
 *
 */
