
public class Binaryinrecursive {

    public static void main(String[] args) {
        int num;
        System.out.print("Binary for 10  is: ");
        DeciltoBin(10);
        System.out.println();
        System.out.print(" binary for 15 is : ");
        DeciltoBin(15);
        System.out.println("");
        System.out.print(" The Binary conversion for 20 is : ");
        DeciltoBin(20);
        System.out.println("");

    }

    public static void DeciltoBin(int num) {
        if (num > 0) {
            DeciltoBin(num / 2);
            System.out.print(num % 2);
        }
        

    }
}

/***OUTPUT***********
 ****** Binary for 10  is: 1010
 ******binary for 15 is : 1111
 *****The Binary conversion for 20 is : 10100 
  
 */