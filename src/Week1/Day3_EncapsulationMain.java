package Week1;

public class Day3_EncapsulationMain {
    public static void main(String [] args) {
        Day3_Encapsulation sencap1 = new Day3_Encapsulation();
        //sencap1.displayStudentRollEncapsulation();
        sencap1.setName("Vinay");
        sencap1.setStudentRollEncapsulation(2);

        System.out.println(sencap1.getName());
        System.out.println(sencap1.getStudentRollEncapsulation());
        System.out.println("studentRollEncapsulation is = " + sencap1.isPrimeNumber(sencap1.getStudentRollEncapsulation()));
    }
}
