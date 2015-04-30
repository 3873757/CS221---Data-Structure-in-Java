/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jambo
 */
public class Library {
    
    private int bookID;
    private String book;
    private String ISBN;
    private String bookName;
    private double price;
    
    Library() {
        
    }
 public Library(int bookid,String ISBN,String bookName,double price){
        this.ISBN = ISBN;
        this.bookID=bookID;
        this.bookName = bookName;
        this.price=price;
        this.book=book;
        
    }

    
    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   public boolean isemplty(){
        return false;
   }
    public void displayLibrary() {

        System.out.print("BookID: " + bookID);
        System.out.print(", Price: " + price);
        System.out.println(", BookNAME: " + bookName);
    }
   

}
