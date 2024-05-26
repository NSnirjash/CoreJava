/*
 * Question:
 * 1.Create a base class Book with private properties title, author, and ISBN. 
 * Provide public getters and setters for these properties.
 * 2. Create a subclass EBook that extends Book and adds a private property 
 * fileSize (in MB) and a method download().
 * 3. Create another subclass PrintedBook that extends Book and adds a private 
 * property weight (in grams) and a method ship().
 * 4. Demonstrate the creation and usage of EBook and PrintedBook objects.
 * 
 */
package librarysystem;

import book.EBook;
import book.PrintedBook;

public class LibrarySystem {

    public static void main(String[] args) {
        EBook eb = new EBook(2.5, "Digital Transformation", "Jane Smith", "1234567890");
        eb.download();
        
        PrintedBook pb = new PrintedBook(1200, "The Art of Programming", "John Doe", "0987654321");
        pb.ship();
    }
    
}
