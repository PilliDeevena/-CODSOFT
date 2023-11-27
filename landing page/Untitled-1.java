// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }

    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Child class
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class SingleInheritanceExample {
    public static void main(String[] args) {
        // Creating an object of the child class
        Dog myDog = new Dog();

        // Accessing methods from both base and derived classes
        myDog.eat();    // Output: Animal is eating...
        myDog.sleep();  // Output: Animal is sleeping...
        myDog.bark();   // Output: Dog is barking...
    }
}
