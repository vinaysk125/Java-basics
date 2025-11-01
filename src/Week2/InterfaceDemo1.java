package Week2;

interface Animal {
    void sound();  // abstract method
    void sleep();  // abstract method
}

class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }

    @Override
    public void sleep() {
        System.out.println("The dog is sleeping.");
    }
}

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping.");
    }
}

public class InterfaceDemo1 {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.sound();  // Output: Bark
        myCat.sound();  // Output: Meow
        myDog.sleep();  // Output: The dog is sleeping.
        myCat.sleep();  // Output: The cat is sleeping.
    }
}

