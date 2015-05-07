
class LinStackGeneric <T>
    {
class Link
{
public T dData;             
public Link next;              

public Link(T dd)           
   { dData = dd; }

public void displayLink()      
   { System.out.print(dData + " "); }
} 

private Link first;            

public LinStackGeneric()              
   { first = null; }           

public boolean isEmpty()       
   { return (first==null); }

public void insertFirst(T dd) 
   {                           
   Link newLink = new Link(dd);
   newLink.next = first;       
   first = newLink;           
   }

public T deleteFirst()      
   {                           
   Link temp = first;          
   first = first.next;         
   return temp.dData;          
   }

public void displayList()
   {
   Link current = first;       
   while(current != null)      
      {
      current.displayLink();   
      current = current.next;  
      }
   System.out.println("");
   }

}  
class LinkStack<T>
{
private LinStackGeneric theList;

public LinkStack()             
   {
   theList = new LinStackGeneric();
   }

public void push(T j)   
   {
   theList.insertFirst(j);
   }

    public T pop() 
    {
        if (!isEmpty()) {
            return (T)theList.deleteFirst();
        }
        return null;
    }

public boolean isEmpty()       
   {
   return ( theList.isEmpty() );
   }

public void displayStack()
   {
   System.out.print("Stack (top-->bottom): ");
   theList.displayList();
   }
}  

