package OOPS.BookCatlog;

import jdk.jfr.Category;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private  int publishYear;
    private Category category;
    private int price;
    private int count;
    Book(String name,String author,String publisher,int publishYear,Category category,int price,int count){
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.publishYear=publishYear;
        this.category=category;
        this.price=price;
        this.count=count;
    }
    public void setName(String name){this.name=name;}
    public String getName(){return name;}

    public void setAuthor(String author){this.author=author;}
    public String getAuthor(){return author;}

    public void setPublisher(String publisher){this.publisher=publisher;}
    public String getPublisher(){return publisher;}

    public void setPublishYear(int publishYear){this.publishYear=publishYear;}
    public int getPublishYear(){return publishYear;}

    public void setCategory(Category category){this.category=category;}
    public Category getCategory(){return category;}
    public void setPrice(int price){this.price=price;}
    public int getPrice(){return price;}

    public void setCount(int count){this.count=count;}
    public int getCount() {return count;}

}
