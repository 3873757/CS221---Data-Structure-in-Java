/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class StackY {
    private int maxSize;        // size of stack array
    private long[] stackArray;
    private int top;            // top of stack
//--------------------------------------------------------------
    public StackY(int s) // constructor
    {
        maxSize = s;             // set array size
        stackArray = new long[maxSize];  // create array
        top = -1;                // no items yet
    }
//--------------------------------------------------------------
    public void push(long j) {
        if (isFull()) {
            System.out.println("The Stuck is full");
        } else {
            stackArray[++top] = j;
        }
    }

//--------------------------------------------------------------
    public long pop() // take item from top of stack
    {
        if (!isEmpty()) {
            return stackArray[top--];
        } else {
            System.out.println("the stack is empty");
        }
        return 0;
    }
//--------------------------------------------------------------
    public long peek() // peek at top of stack
    {
        return stackArray[top];
    }
//--------------------------------------------------------------
    public boolean isEmpty() // true if stack is empty
    {
        return (top == -1);
    }
//--------------------------------------------------------------
    public boolean isFull() // true if stack is full
    {
        return (top == maxSize - 1);
    }
    public void display(){
        for (int i=0;i<stackArray.length;i++){
            System.out.println(stackArray[i]);
        }              
    }
    public  int size(){
        return top+1;
    }
    public void Cllear(){
        stackArray=null;       
    }
    public boolean Contains(long j){
        return false;
            }
    public String toString() {
        String out = "";
        for (int i = top; i >= 0; i--) {
            out = out + stackArray[i] + " ";
        }
        return "[ " + out + "]";
    }
}
