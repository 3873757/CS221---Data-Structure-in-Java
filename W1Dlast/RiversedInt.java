
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jambo
 */
public class RiversedInt {

    public static void main(String[] args) {
        int num;
        int number = 0;
        Queue<Integer> queue = new LinkedList<Integer>();
        System.out.println("Enter Your number");
        Scanner nums = new Scanner(System.in);
        num = nums.nextInt();
        while (num != 0) {
            number = num % 10;
            queue.offer(number);
            num = num / 10;
            System.out.print(queue.poll());

        }

    }
}
                   /****************
                           * Enter Your number
                              3456783
                              3876543                            
                    **********************/