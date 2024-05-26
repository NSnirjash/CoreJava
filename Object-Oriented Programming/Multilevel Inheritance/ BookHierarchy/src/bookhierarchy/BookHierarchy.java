/*
 *
 * Question:
 * Design a class hierarchy for a library system using multilevel inheritance:
 * 1. Create a base class called Book with properties title and author, and methods read() and getDetails().
 * 2. Create a subclass EBook that extends Book. Add a method download().
 * 3. Further, create a subclass InteractiveEBook that extends EBook. Add a method playVideo().
 * 4. Create objects of InteractiveEBook and demonstrate the use of all methods from Book, EBook, and InteractiveEBook.
 *
 */
package bookhierarchy;

import book.InteractiveEBook;

public class BookHierarchy {

    public static void main(String[] args) {
        InteractiveEBook i = new InteractiveEBook("The Future of AI", "John Doe");
        
        i.read();
        i.getDetails();
        i.download();
        i.playVideo();
    }
    
}
