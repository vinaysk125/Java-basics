package Week1;

class Day3_PersonPolySchoolDemoClass {
    public void displayRole(){
        System.out.println("I am Person");
    }
}
class TecherSchoolDemo extends Day3_PersonPolySchoolDemoClass {
    public void displayRole(){
        System.out.println("I am Teacher");
    }
}
class StudentSchoolDemo extends Day3_PersonPolySchoolDemoClass {
    public void displayRole(){
        System.out.println("I am Student");
    }
}
