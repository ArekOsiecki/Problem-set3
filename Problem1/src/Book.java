public class Book {

    private String title, isbn;
    private int pages;
    private double price;

    public void setTitle(String bookTitle){
        this.title = bookTitle;
    }
    public void setIsbn(String isbnNum){
        this.isbn = isbnNum;
    }
    public void setPages(int bookPages){
        this.pages = bookPages;
    }
    public void setPrice(double bookPrice){
        this.price = bookPrice;
    }

    public String getTitle(){
        return title;
    }

    public String getIsbn(){
        return isbn;
    }

    public int getPages(){
        return pages;
    }

    public double getPrice(){
        return price;
    }


    public String toString(){

            String bookString = "Book title: "+title+"\nBook ISBN :"+isbn+"\nNumber of pages :"+pages+"\nBook price :"+price+" Euro";

            return bookString;
    }

    public Book (){

        this.title = "No Title";
        this.isbn = "No ISBN";
        this.pages = 0;
        this.price = 0.00;
    }

    public Book (String title, String isbn, int pages, double price){

        this.title = title;
        this.isbn = isbn;
        this.pages = pages;
        this.price = price;

    }

}
