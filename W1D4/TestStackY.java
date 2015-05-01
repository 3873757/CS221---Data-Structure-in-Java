
public class TestStackY {    
    public static void main(String[] args) {      

        StackY Stacky = new StackY(10);
        StackY Stackx = new StackY(10); // make new stack
        Stacky.push(20);               // push items onto stack
        Stacky.push(40);
        Stacky.push(60);
        Stacky.push(80);
        Stacky.push(12);
        Stackx.push(10);
        Stackx.push(30);
        Stackx.push(50);
        Stackx.push(70);
        Stackx.push(90);
        System.out.println("Stackx before merge: " + Stackx);
        System.out.println("Stacky before merge: " + Stacky);
        System.out.println("The Meged Stack of stackx and stacky " + merge(Stackx, Stacky));
        Stackx.toString();
        Stacky.toString();
        Stackx.display();
        Stacky.size();
        for (int i = 0; i < Stackx.size(); i++) {
            for (int j = 0; j < Stacky.size(); j++) {
                long[] temp = new long[Stackx.size() + Stacky.size()];
            }
        }
    }
    public static StackY merge(StackY one, StackY two) {
        int size = one.size() + two.size();
        StackY temp = new StackY(size);
        for (int i = one.size(); i > 0; i--) {
            temp.push(one.pop());
        }
        for (int i = two.size(); i > 0; i--) {
            temp.push(two.pop());
        }
        return temp;
    }
}
/*                outputs
 * Stackx before merge: [ 90 70 50 30 10 ]
Stacky before merge: [ 12 80 60 40 20 ]
The Meged Stack of stackx and stacky [ 20 40 60 80 12 10 30 50 70 90 ]
10
30
50
70
90

 */