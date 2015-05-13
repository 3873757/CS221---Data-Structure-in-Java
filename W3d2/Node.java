
public class Node {

    public int iData;              
    public double dData;           
    public Node leftChild;         
    public Node rightChild;        

    public void displayNode() 
    {
        System.out.print('{');
        System.out.print(iData);
        System.out.print(", ");
        System.out.print(dData);
        System.out.print("} ");
    }
}
class Tree1 {
    private Node root;             

    public Tree1() 
    {
        root = null;
    }            
    
    public Node find(int key) 
    {                           
        Node current = root;               
        while (current.iData != key) 
        {
            if (key < current.iData) 
            {
                current = current.leftChild;
            } else 
            {
                current = current.rightChild;
            }
            if (current == null)
            {
                return null;                 
            }
        }
        return current;                    
    }  

    public void insert(int id, double dd) {
        Node newNode = new Node();    
        newNode.iData = id;           
        newNode.dData = dd;
        if (root == null) 
        {
            root = newNode;
        } else 
        {
            Node current = root;       
            Node parent;
            while (true) 
            {
                parent = current;
                if (id < current.iData) 
                {
                    current = current.leftChild;
                    if (current == null) 
                    {                 
                        parent.leftChild = newNode;
                        return;
                    }
                } 
                else 
                {
                    current = current.rightChild;
                    if (current == null) 
                    {                
                        parent.rightChild = newNode;
                        return;
                    }
                }  
            }  
        }  
    } 
    public double findmax() {
        if (root == null) {
            return 0;
        }
        Node current = root;
        while (current.rightChild != null) {

            current = current.rightChild;
        }
        return current.iData;
    }

    public double findmin(){
        if(root==null){
            return 0;
        }
        Node current = root;
        while(current.leftChild!=null){
            current=current.leftChild;
            
        }
        return current.iData;
           }
   
    void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.leftChild);
            System.out.print(localRoot.iData + " ");
            inOrder(localRoot.rightChild);
        }
    }
    void preorder(Node localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.iData + " ");
            preorder(localRoot.leftChild);
            preorder(localRoot.rightChild);
        }
    }
    void postOrder(Node localRoot) {

        if (localRoot != null) {
            postOrder(localRoot.leftChild);
            postOrder(localRoot.rightChild);
            System.out.print(localRoot.iData + " ");
        }
    }
    int countLeaf(Node current){
     
        if(root==null)
        {
            return 0;
        }
        else if (current.leftChild==null && current.rightChild==null)
        {
            return 1;
        }
        else{
            return  countLeaf(current.leftChild) + countLeaf(current.rightChild);
        }
    }
    Node getRoot()
    {
        return root;
    }

}  

class BSTDemo {

    public static void main(String[] args) 
    {
        Tree1 theTree = new Tree1();
        theTree.insert(50, 1.5);
        theTree.insert(25, 1.2);
        theTree.insert(75, 1.7);
        theTree.insert(12, 1.5);
        theTree.insert(37, 1.2);
        theTree.insert(43, 1.7);
        theTree.insert(30, 1.5);
        Node f = theTree.find(25);
        double f1= theTree.findmax();
        System.out.print("Item found at key 25 is ");
         f.displayNode();
         System.out.println();
         System.out.println("the max  value is " +theTree.findmax());
        System.out.println("the min value  is " +theTree.findmin());
        System.out.println("\nInorder Traversal is : ");
         System.out.println(" ");
        theTree.inOrder(theTree.getRoot());
         System.out.println(" ");
        System.out.println("the number of leaf is  "+theTree.countLeaf(f));
       
        System.out.println("\nPreorder Traversal is : ");
        theTree.preorder(theTree.getRoot());
        
        System.out.println("\nPostorder Traversal is : ");
        theTree.postOrder(theTree.getRoot());
        
    }  

}  
/****
 *** Item found at key 25 is {25, 1.2} 
***  the max  value is 75.0
*****the min value  is 12.0

Inorder Traversal is : 
 ******12 25 30 37 43 50 75
 * 
***** the number of leafNode is  3
* 
*******Preorder Traversal is : 
******* 50 25 12 37 30 43 75 
* 
Postorder Traversal is : 
********12 30 43 37 25 75 50
 **/
