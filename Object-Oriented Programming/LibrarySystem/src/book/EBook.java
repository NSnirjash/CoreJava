
package book;

public class EBook extends Book{
    private double fileSize;

    public EBook() {
    }

    public EBook(double fileSize) {
        this.fileSize = fileSize;
    }

    public EBook(double fileSize, String title, String author, String ISBN) {
        super(title, author, ISBN);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
    
    
    
    public void download(){
        System.out.println("Downloading the eBook titled '" + getTitle() + "' by " + getAuthor() + ". File size: " + fileSize + " MB.");
    }
}
