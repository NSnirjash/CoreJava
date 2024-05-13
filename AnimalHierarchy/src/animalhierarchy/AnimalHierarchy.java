/*
 * Define a superclass called Animal with attributes like name and age. Create 
 * subclasses like Dog, Cat, and Bird inheriting from Animal. Implement methods 
 * to make specific sounds for each type of animal.
 */
package animalhierarchy;

import animal.Bird;
import animal.Cat;
import animal.Dog;

/**
 *
 * @author User
 */
public class AnimalHierarchy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dog d = new Dog("Kutta", 5);
        d.makeSound();
        Cat c = new Cat("Bilai", 4);
        c.makeSound();
        Bird b = new Bird("koitor", 6);
        b.makeSound();
    }
    
}
