package edu.northeastern.neelam;

public class Reference extends Book {

    public String category;


    public Reference(String title, Double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return "World "+this.getTitle()+" all information is real.";
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}