package by.itacademy.moiseenkolydia.javabasics.oop;

public class Book {
    private int id;
    private String title;
    private String author;
    private String publisher;
    private int publishDate;
    private  int numberOfPages;
    private  double price;

    public void setId(int newId){
        id = newId;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {return publisher;}
    public int getPublishDate() {
        return publishDate;
    }
    public int getNumberOfPages() {
        return numberOfPages;
    }
    public double getPrice() {
        return price;
    }
}
