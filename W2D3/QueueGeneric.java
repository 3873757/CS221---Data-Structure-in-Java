
public class QueueGeneric<T> {

    private int maxSize;
    private T[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueGeneric(int s) 
    {
        maxSize = s;
        queArray = (T[]) new Object[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public int insert(T j) 
    {
        if (rear == maxSize - 1) 
        {
            rear = -1;
        }
        queArray[++rear] = j;         
        return nItems++;                     
    }

    public T remove() 
    {
        T temp = queArray[front++]; 
        if (front == maxSize) 
        {
            front = 0;
        }
        nItems--;                      
        return temp;
    }

    public T peekFront() 
    {
        return queArray[front];
    }

    public boolean isEmpty() 
    {
        return (nItems == 0);
    }

    public boolean isFull() // true if queue is full
    {
        return (nItems == maxSize);
    }

    public int size() // number of items in queue
    {
        return nItems;
    }

}  
class QueueApp {

    public static void main(String[] args) {
        QueueGeneric<Integer> theQueue = new QueueGeneric<Integer>(5);  

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        System.out.println("Front of the Queue : " + theQueue.peekFront());
        theQueue.remove();
        theQueue.remove();
        theQueue.remove();
        System.out.println("Front of the Queue  : " + theQueue.peekFront());
        theQueue.insert(50);
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);
        
        QueueGeneric<String> theQueue1 = new QueueGeneric<String>(15);
        
        theQueue1.insert("MAth");
        theQueue1.insert("Computer Science");
        theQueue1.insert("Physics");
        theQueue1.insert("Calculus");
        theQueue1.insert("chemistry");

        System.out.println("Front of the Queue : " + theQueue.peekFront());
        System.out.println("Size of the Queue : " + theQueue.size());
        System.out.println("Size of the Queue : " + theQueue1.size());
        System.out.println("Front of the Queue : " + theQueue1.peekFront());
        
        theQueue1.remove();
        System.out.println("," + theQueue1.peekFront());
        
        while (!theQueue.isEmpty()) {
            long n = theQueue.remove();
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
        System.out.println("Size of the Queue : " + theQueue.size());

    }
}
/*Front of the Queue : 10
***Front of the Queue  : 40
***Front of the Queue : 40
***Size of the Queue : 5
***Size of the Queue : 5
**Front of the Queue : MAth
,*Computer Science
**40 50 60 70 80 
 * 
 * /
 
 
