package Day5_OOPS1;

// Student is class

    class Student{

        String name;
        int age;
        double marks;

        // default constructure
        public Student() {
            this.name = "Vinay";
            this.age = 24;
            this.marks = 94.20;
        }

        //Parametarized constructer
        public Student(String name, int age, double marks){
            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        // Another parameerized constructer
        public Student(String name, int age) {
            this.name = name;
            this.age = age;
            this.marks = 0.0; // default value
        }

        void print(){
            System.out.println("User name = " + name + ", age = " + age + ", marks = " + marks);
        }
    }

    // Main function to run the program
public class ConstructureOOPS1 {
    public static void main(String[] args){

        Student object1 = new Student();

        object1.print();

        Student object2 = new Student("Binod", 26, 95.20);

        object2.print();

        Student Object3 = new Student("Chagan", 30);
        Object3.print();
    }
}
