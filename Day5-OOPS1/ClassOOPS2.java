// Add a method printInfo() to Dog that prints name and age, and call it from DogTest.

    // Dog clas
    class DogTest {

        String name;
        int age;

        void printInfo(){
            System.out.println("Dog name = " + name + " age = " + age);
        }
    }

    // Main class
public class ClassOOPS2 {
    public static void main(String[] args){

        DogTest mydog = new DogTest(); // Creating object mydog for class Mydog

        mydog.name = "Sheru";
        mydog.age = 2;

        mydog.printInfo();

    }
}
