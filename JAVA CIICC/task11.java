class Book{
    String title;
    String author;
    int yearPublished;
    double price;
public Book(String title, String author,int yearPublished,double price){
    this.title = title;
    this.author = author;
    this.yearPublished = yearPublished;
    this.price = price;
} 
    public void printBook(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: "+ Integer.toString(yearPublished));
        System.out.println("Price: "+Double.toString(price)+"\n");

    }
}

public class task11 {

    public static void main(String[] args) {
        Book[] books = new Book[]{
           new Book("Java Programming", "John Smith", 2021, 39.99),
           new Book("Python Basics", "Jane Doe",2020,29.99),
           new Book ("C++ Essentials", "Michael Johnson",2019,49.99) 
        };
        for (Book s:books){
            s.printBook();
        }
    }

}
