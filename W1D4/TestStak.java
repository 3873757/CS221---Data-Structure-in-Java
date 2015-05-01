package w1d4;

import java.io.IOException;
import java.util.Scanner;

public class TestStak {

    public static void main(String[] args) throws IOException {
        String Input;
        StackList stk = new StackList(4);
        while (true) {
            System.out.println("Enter  what you want to do: ");
            Scanner in = new Scanner(System.in);
            Input = in.next();
            if (Input.equals("push")) {
                if (stk.isFull()) {
                    System.out.println("the stack is full");
                } else {
                    Long value = in.nextLong();
                    stk.push(value);
                }
            }
            if (Input.equals("pop")) {

            if (stk.isEmpty()) {
                    System.out.println("The stack is empty");
            } else {
                    stk.pop();
                    System.out.println("the data poped is:" + stk.pop());
                }
            }
            if (Input.equals("peek")) {
            if (stk.isEmpty()) {
                    System.out.println("Error");
            } else {
                    stk.peek();
                    System.out.println("the data is" + stk.peek());
                }
            }

            if (Input.equals("quit")) {
                break;
            }
        }
        System.out.println("Quit");
    }
}
/*          outputs***********
 * run:
Enter  what you want to do: 

push
89
Enter  what you want to do: 
push
78
Enter  what you want to do: 
push
40
Enter  what you want to do: 
push
86
Enter  what you want to do: 
push
the stack is full
Enter  what you want to do: 
43
Enter  what you want to do: 
push
the stack is full
Enter  what you want to do: 
peek
the data is86
Enter  what you want to do: 
pop
the data poped is:40
Enter  what you want to do: 
quit
Quit
 * 
 */