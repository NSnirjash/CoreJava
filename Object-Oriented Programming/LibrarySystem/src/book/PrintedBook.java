
package book;

public class PrintedBook extends Book{
    private double weight;

    public PrintedBook() {
    }

    public PrintedBook(double weight) {
        this.weight = weight;
    }

    public PrintedBook(double weight, String title, String author, String ISBN) {
        super(title, author, ISBN);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
    
    public void ship(){
        System.out.println("Shipping the printed book titled '" + getTitle() + "' by " + getAuthor() + ". Weight: " + weight + " grams.");
    }
}
