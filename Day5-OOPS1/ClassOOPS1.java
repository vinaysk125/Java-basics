
    // public Class dog

    class dog {
        String name;
        int age;

        void bark(){
            System.out.println(name + " Syas woof!");
        }
    }

    // Main class

public class ClassOOPS1 {
    public static void main(String[] args){

        dog mydog = new dog();

        mydog.name = "Sheru";
        mydog.age = 2;

        mydog.bark();

    }
}
