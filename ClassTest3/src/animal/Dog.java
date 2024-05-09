
package animal;

public class Dog extends Animal{
    private String breed;

    public Dog() {
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(String breed, int age, String name) {
        super(age, name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" + "breed=" + breed + '}';
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
        System.out.println("Name: "+super.getName()+", Age: "+super.getAge()+", Breed: "+this.getBreed());
        super.makeSound(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
}
