
package book;

public class EBook extends Book{

    public EBook() {
    }

    public EBook(String title, String author) {
        super(title, author);
    }
    
    public void download() {
        System.out.println("Downloading the eBook titled '" + getTitle() + "' by " + getAuthor());
    }
}
