
public class RevisedPriorityQ {

    private int maxSize;
    private long[] queArray;
    private int nItems;

    public RevisedPriorityQ(int s) {
        maxSize = 50;
        queArray = new long[10];
        nItems = 0;
    }

    public void insert(int item) {
        //int j;
        if (nItems == maxSize) {
            System.out.println("the stack is full");
        } else {
            queArray[nItems++] = item;
        }
    }

    public long remove(long value) {
        int i = 0;
        if (nItems == 0) {
            System.out.println("the stack is empty");
        } else {
            for (i = maxSize - 1; i >= 0; i--) {
                if (value == queArray[i]) {
                    break;
                }
                if (nItems == i) {
                    return -1;//  return     queArray[--nItems];
                } else {
                    queArray[i] = queArray[i - 1];
                }
            }
            //return 0;
        }
        return queArray[i];
    }

    public void display() {
        System.out.println("the item delted is:");
        for (int k = 0; k < queArray.length; k++) {
            System.out.println("the item delited is:" + queArray[k]);
        }

    }
}
