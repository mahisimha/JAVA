package JAVA2;

final class Dog extends Animal {// as i have used final here if example 'breed' class tries to inherit dog it
                                // would throw an error
                                // final methods cannot be overridden
    @Override
    void makeSound() {
        System.out.println("Bark!");
    }
}
