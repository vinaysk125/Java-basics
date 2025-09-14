package Day_6_OOPS2;

class Animal {
    void sound(){
        System.out.println("Some sound");
    }
}

class Dog extends Animal {

}

public class Inheritance {
    public static void main(String[] args){
    Dog a = new Dog();
    a.sound();
    }
}
