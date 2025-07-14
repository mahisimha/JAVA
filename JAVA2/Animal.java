package JAVA2;

abstract public class Animal {
    abstract void makeSound(); // abstract method

    void sleep() { // concrete method
        System.out.println("Sleeping...");
    }

}
