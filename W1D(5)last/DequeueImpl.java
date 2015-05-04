
/**
 *
 * @author jambo Extra Credit
 *
 */
public class DequeueImp {

    private int maxSize;
    private long[] dqeuearray;
    private int front;
    private int rear;
    private int nuItems;

    public DequeueImp(int size) {
        this.maxSize = size;
        this.dqeuearray = new long[maxSize];
        front = 0;
        rear = -1;
        nuItems = 0;
    }
    public void insertRight(long item) {
        if (rear == maxSize - 1) {
            rear = -1;
        }

        dqeuearray[++rear] = item;
        nuItems++;
    }
    public void insetLeft(long item) {
        if (rear == maxSize - 1) {
            rear = -1;
        }
        for (int i = 1; i < rear; i++) {
            dqeuearray[i] = dqeuearray[i + 1];
        }
        dqeuearray[0] = item;
        nuItems++;
    }

    public long removeLeft() {
        long temp = dqeuearray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nuItems--;
        return temp;
    }

    public long removeRight() {
        long temp = dqeuearray[0];
        if (rear == maxSize - 1) {
            front = 0;
        }
        nuItems--;
        return temp;
    }

    public long peekFirst() {
        return dqeuearray[front];
    }

    public boolean isEmpty() {
        return (nuItems == 0);
    }

    public boolean isFull() {
        return (nuItems == maxSize);
    }

    public long CurrentSize() {
        return nuItems;

    }

    public static void main(String[] args) {
        DequeueImp queue = new DequeueImp(20);
        queue.insertRight(70);
        queue.insertRight(80);
        queue.insertRight(60);
        queue.insertRight(10);
        System.out.println("The First Item after right Insertion: " + queue.peekFirst());
        System.out.println("The size after peek: " + queue.CurrentSize());
        queue.insetLeft(20);
        queue.insetLeft(30);
        queue.insetLeft(100);
        System.out.println("The First Item after Left Insertion: " + queue.peekFirst());
        System.out.println("The size after peek: " + queue.CurrentSize());
        queue.removeLeft();
        queue.removeRight();
        System.out.println("The size after peek: " + queue.CurrentSize());
        System.out.println(queue.peekFirst());


    }
}
/*
 * The First Item after right Insertion: 70
 The size after peek: 4
 The First Item after Left Insertion: 100
 The size after peek: 7
 The size after peek: 5
 10 
 ****************************/
