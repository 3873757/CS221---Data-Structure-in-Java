
public class LinerarRecSearch {
    public static void main(String[] args){

    int[]array = {5,5,6,7,8,3,4};
    
    int serachkey;
    int index=0;
     System.out.println("linearSearch key  44): " + linearSearch(array,44,8));
     System.out.println("linearSearch key  7): " + linearSearch(array,3,7));
     
   }

    public static boolean linearSearch(int[]array,int index, int serachkey) {
        if(index>array.length){
            return false;
        }
        else
             if (array[index] == serachkey) {
                 return true;
                 } 
             else {
                 linearSearch(array, index + 1, serachkey);
             }
        return false;
    }
  
}
/***  OUTPUT*********
 * linearSearch key  44): false
   linearSearch key  7): true 
 * 
 * */

