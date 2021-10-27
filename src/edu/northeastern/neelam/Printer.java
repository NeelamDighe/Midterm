package edu.northeastern.neelam;

public class Printer {
    public static void main(String[] args) {
        Printer p1 = Printer.getInstance();
        p1.getConnection();
    }

    private static Printer instance= new Printer();
    private Printer(){}
    private static Object obj= new Object();
    public static Printer getInstance(){
        synchronized (obj){
            if(instance == null){
                instance = new Printer();
            }
        }
        return instance;
    }
    public void getConnection() {
        System.out.println("Your Printer is working");
    }
}
