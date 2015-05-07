
public class StackLInktestApp {
    
public static void main(String[] args)
    {
    LinkStack<Integer> theStack = new LinkStack<Integer>(); 

        theStack.push(20);
        theStack.push(40);
        theStack.displayStack();
        theStack.push(60);
        theStack.push(80);
        theStack.displayStack();
        theStack.pop();
        theStack.pop();
        theStack.displayStack();
        theStack.pop();
        theStack.pop();
        System.out.println("Item Deleted : " + theStack.pop());
        theStack.displayStack();
    LinkStack<String> theStack1 = new LinkStack<String>(); 
    theStack1.push("USA");
    theStack1.push("Canada");
    theStack1.push("Ethiopia");
    theStack1.push("Nigeria");
    theStack1.push("Keneya");
    
     theStack1.displayStack();
    }
}
/*****Stack (top-->bottom): 40 20 
*****Stack (top-->bottom): 80 60 40 20 
*****Stack (top-->bottom): 40 20 
*****Item Deleted : null
*****Stack (top-->bottom): 
*****Stack (top-->bottom): Keneya Nigeria Ethiopia Canada USA 

*/
