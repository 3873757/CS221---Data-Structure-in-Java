
class Node {

    String value;
    Node next;
    Node previous;

    public Node(String value) {
        this.value = value;
    }

    public void display() {
        System.out.print(value +  " , ");
    }
}

class Nodeop {

    private Node first;
    private Node last;

    public Nodeop() {
        first = null;
        last = null;
    }

    public boolean isEmpty() {

        return first == null;
    }

    public void addfront(String Value) {
        Node newNode = new Node(Value);

        if (isEmpty()) {
            last = newNode;
        } else {
            first.previous = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void addlast(String value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.previous = last;
        }
        last = newNode;
    }

    public boolean addpost(Node n, String value) {
        Node current = first;
        while (current.value != n.value) {
            current = current.next;
            if (current == null) {
                return false;
            }
        }
        Node newNode = new Node(value);
        if (current == last) {
            last = newNode;
            newNode.previous = current;
            current.next = newNode;
        } else {
            newNode.next = current.next;
            current.next.previous = newNode; // old current <-- newLink
            newNode.previous = current;
            current.next = newNode;
        }
        return true;
    }

    public int size() {
        int count = 0;
        for (Node current = first; current != null; current = current.next) {
            count++;
        }
        return count;
    }

    public boolean addpre(Node n, String value) {
        Node current = last;
        while (current.value != n.value) //
        {
            current = current.previous;
            if (current == null) {
                return false;

            }
        }
        Node newNode = new Node(value);
        if (current == first) {
            first.previous = newNode;
            newNode.next = first;
            first = newNode;
        } else {
            newNode.next = current;
            current.previous = newNode;
            //newNode.next = current;
            current.previous.next = newNode;
            newNode.previous = current.previous;
        }
        return true;
    }

    public void find(String value) {
        for (Node current = first; current != null; current = current.next) {
            if (current.value.equals(value)) {
                System.out.println(current.value);
            }
        }
    }

    public void delete(Node n) {
        Node current = first;
        if (current.value.equals(n.value)) {
            current = null;
        }
        current = current.next;
    }

    public void deleteNode() {
        for (Node current = first; current != null; current = current.next) {

            current.value = null;
        }
    }

    public void printrevers() {
        for (Node current = last; current != null; current = current.previous) {
            current.display();
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Nodeop node = new Nodeop();

        node.addfront("Corejava");
        node.addlast("Visual basic");
        node.addpre(new Node("Node10"), "happy");
        Nodeop node1 = new Nodeop();
        node1.addfront("Archtecture");
        node1.addlast("POython");
        Nodeop node5 = new Nodeop();
        node5.addfront("C#");
        node5.addlast("Statistics");
        Nodeop node2 = new Nodeop();
        node2.addfront("Awesome");
        node2.addlast("Niceday");
        Nodeop node3 = new Nodeop();
        node1.addfront("C++");
        node1.addlast("Meron");
        node2.addpost(new Node("Two"), "jambo");
        node.addlast("Melodia");
        node.addfront("Stella");
        Nodeop node4 = new Nodeop();
        node4.addfront("Mathematics");
        node4.addlast("Physics");
        Nodeop node7 = new Nodeop();
        node2.addpre(new Node("one"), "chemistry");
        node4.addpost(new Node("moon"), "volcano");
        node2.addlast("DataStructure");
        node3.addfront("Precalculus");
        node3.addlast("Analysis");
        node.printrevers();
        node2.printrevers();
        node3.printrevers();
        node4.printrevers();
        node5.printrevers();
        node7.printrevers();
    }
}
/*
 * Melodia , Visual basic , Corejava , Stella ,  
  * DataStructure , Niceday , Awesome ,  
  * Analysis , Precalculus ,  
  * Physics , Mathematics ,  
  * Statistics , C# ,  
 * 
 */