package Week1;

public class Day3_SchoolDemoClassMain {
    public static void main(String [] args){

        // Person object
        Day3_PersonPolySchoolDemoClass p = new Day3_PersonPolySchoolDemoClass();
        p.displayRole();  // Outputs: "I am Person"

        // Teacher object
        Day3_PersonPolySchoolDemoClass t = new TecherSchoolDemo();
        t.displayRole();  // Outputs: "I am Teacher"

        // Student object
        Day3_PersonPolySchoolDemoClass s = new StudentSchoolDemo();
        s.displayRole();  // Outputs: "I am Student"


        // Array of object -> people
          Day3_PersonPolySchoolDemoClass[] people = new Day3_PersonPolySchoolDemoClass[3];
          people[0] = new Day3_PersonPolySchoolDemoClass();
          people[1] = new TecherSchoolDemo();
          people[2] = new StudentSchoolDemo();

        for(Day3_PersonPolySchoolDemoClass person: people){
            person.displayRole();
        }
    }
}
