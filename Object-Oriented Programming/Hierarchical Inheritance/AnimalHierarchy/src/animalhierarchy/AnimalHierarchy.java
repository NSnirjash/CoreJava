/* 
 *Question: Create a class hierarchy for animals. Use the following guidelines:
 *1. Create a base class called Animal with methods eat() and sleep().
 *2. Create two subclasses: Mammal and Bird.
 *3. In Mammal, add a method walk().
 *4. In Bird, add a method fly().
 *5. Further, create two more subclasses from Mammal: Dog and Cat.
 *6. Implement additional methods in Dog (bark()) and Cat (meow()).
 *7. Demonstrate the usage of each method from the subclasses.
 */
package animalhierarchy;

import animal.Animal;
import animal.Bird;
import animal.Cat;
import animal.Dog;
import animal.Mammal;

public class AnimalHierarchy {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.sleep();
        
        Mammal m = new Mammal();
        m.eat();
        m.sleep();
        m.walk();
        
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
        
        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.walk();
        d.bark();
        
        Cat c = new Cat();
        c.eat();
        c.sleep();
        c.walk();
        c.meow();
        
        
    }
    
}
