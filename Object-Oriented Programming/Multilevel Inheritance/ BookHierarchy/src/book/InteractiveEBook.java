
package book;

public class InteractiveEBook extends EBook{

    public InteractiveEBook() {
    }

    public InteractiveEBook(String title, String author) {
        super(title, author);
    }
    
    public void playVideo() {
        System.out.println("Playing video in the interactive eBook titled '" + getTitle() + "' by " + getAuthor());
    }

}
