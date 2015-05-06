
public class PriorityQueueTest 
{
    public static void main(String[] args)
    {                            
    PriorityQueue PrQueuesorted = new PriorityQueue();
    PrQueuesorted.insert(20);    
    PrQueuesorted.insert(40);
    PrQueuesorted.insert(30);
    PrQueuesorted.insert(10);
    PrQueuesorted.insert(90);
    PrQueuesorted.displayList();
    PrQueuesorted.remove();
    System.out.println("The data after deletion: ");
    PrQueuesorted.displayList();
    PrQueuesorted.insert(70);    // insert 3 more items
    PrQueuesorted.insert(30);
    PrQueuesorted.insert(45);
    PrQueuesorted.insert(50);
    PrQueuesorted.insert(60);
    System.out.println("The whole List of data after second insertion: ");
    PrQueuesorted.displayList(); 
    PrQueuesorted.remove();      
    System.out.println("The data After deletion is :");
    PrQueuesorted.displayList(); 
    }  
    
}
/* List (first-->last): 10 20 30 40 90 
   The data after deletion: 
   List (first-->last): 20 30 40 90 
   The whole List of data after second insertion: 
   List (first-->last): 20 30 30 40 45 50 60 70 90 
   The data After deletion is :
   List (first-->last): 30 30 40 45 50 60 70 90 
 * 
 * 
 * 
 */
