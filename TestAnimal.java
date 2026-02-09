class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();

        Dog d = new Dog();
        d.makeSound();

        Cat c = new Cat();
        c.makeSound();
    }
}
