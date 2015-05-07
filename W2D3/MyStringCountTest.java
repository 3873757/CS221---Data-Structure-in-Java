
public class MyStringCountTest {
    
public static void main(String args[])
{
	MyStringCount<String> text = new MyStringCount<String>(40);
        String[]array={"TX","CA","WA","NY","FL","MN","TX","WA","TX","FL","Fl","WA"};
	System.out.println("The Number of Occurance of TX :" + text.countOccurrences(array, "TX"));
        System.out.println("The Number of Occurance of FL :" + text.countOccurrences(array, "FL"));
        
	
	MyStringCount<Integer> Int = new MyStringCount<Integer>(40);
        Integer[]ArayInt={10,20,30,40,50,60,60,50,30,30,20,20,30,20,30,60};
        System.out.println("The Number of Occurance of 20 :" + Int.countOccurrences(ArayInt, 20));
        System.out.println("The Number of Occurance of 60 :" + Int.countOccurrences(ArayInt, 60));
        System.out.println("The Number of Occurance of 30 :" + Int.countOccurrences(ArayInt, 30));
               	
}
}

/*The Outputs
 * 
***The Number of Occurance of TX :3
***The Number of Occurance of FL :2
***The Number of Occurance of 20 :4
***The Number of Occurance of 60 :3
***The Number of Occurance of 30 :5


