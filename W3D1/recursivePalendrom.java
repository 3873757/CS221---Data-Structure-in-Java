
public class recursivePalendrom {

    String str;
    char[] strChar;

    public static void main(String[] args) 
    {
        System.out.println(isPalendrom("Fishi"));
         System.out.println(isPalendrom("HooH"));
          System.out.println(isPalendrom("USA"));
           System.out.println(isPalendrom("MUM"));
            System.out.println(isPalendrom("POP"));
             System.out.println(isPalendrom("CIVIC"));
              System.out.println(isPalendrom("DOOMMOOD"));       
    }

    public static boolean isPalendrom(String Str) {
        if (Str.length() == 0) {
            return false;
        } else if (Str.charAt(0) == (Str.charAt(Str.length() - 1))) {
            return true;
        } else {
            return false;
        }
    }
}
/**** OUTPUT ****
***** false
***** true
***** false
***** true
***** true
***** true
***** true  
 *****/
