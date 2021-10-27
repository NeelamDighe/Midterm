package edu.northeastern.neelam;

public class Fiction extends Book implements iBorrowable {

    public Fiction(String title, Double price, String publishYear) {
        super(title, price, publishYear);
    }

    @Override
    public String description() {
        return this.getTitle()+" all events are imaginary and not based on real facts";
    }

    @Override
    public void setBorrowDate(int day) {
        this.borrowDate = day;
    }

    @Override
    public void setReturnDate(int day) {
        this.returnDate = day;
    }

    @Override
    public boolean isAvailable(int day) {

        if(this.returnDate >= day && this.borrowDate <= day)
            return false;

        return true;
    }
}