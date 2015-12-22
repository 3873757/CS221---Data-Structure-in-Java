
package w1d4;
public class StackList {   
private int maxSize;
private long[] stackArray;
private int top;
//--------------------------------------------------------------
public StackList(int s)       // constructor
{
maxSize = s;
stackArray = new long[maxSize];
top = -1;
}
public void push(long j)  // put item on top of stack
{
    if(isFull()){
       System.out.println("The Stuck is full");
           }
    else{
        stackArray[++top] = j;
  }
}
//--------------------------------------------------------------
public long pop()         // take item from top of stack
{
 if(!isEmpty()) {
        return stackArray[top--];
    }

 else {
        System.out.println("the stack is empty");
   }
     return 0;
 }
//--------------------------------------------------------------
public long peek()        // peek at top of stack
{
return stackArray[top];
}
public  int size(){
        return top+1;
    }
//--------------------------------------------------------------
public boolean isEmpty()    // true if stack is empty
{
return (top == -1);
}
public boolean isFull(){
    return (top == maxSize-1);
}
}


