public class StudentServiceTest {
    public static void main(String[] args){

        Student1 s1 = new Student1("Vinay", 11, 96.20);
        Student1 s2 = new Student1("Binod", 22, 94.20);

        System.out.println("Averge marks = " + StudentService.AverageMarks(s1, s2));
        Student1 top = StudentService.topper(s1, s2);
        System.out.println("Topper is = " + top.getName());

    }
}
