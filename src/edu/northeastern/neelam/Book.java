package edu.northeastern.neelam;

public abstract class Book {
    private String title;
    private double price;
    private String publishYear;

    public int returnDate;
    public int borrowDate;

    public Book(String title, Double price, String publishYear){
        this.title = title;
        this.price = price;
        this.publishYear = publishYear;
    }

    public abstract String description();

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public int getBorrowDate() {
        return borrowDate;
    }

    public int getReturnDate() {
        return returnDate;
    }
}