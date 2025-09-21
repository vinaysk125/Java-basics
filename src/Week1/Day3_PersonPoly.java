package Week1;

class Day3_PersonPoly {
    public void displayInfoPoly(){
        System.out.println("Hi I am person!");
    }
}
class TeacherPoly extends Day3_PersonPoly{
    public void displayInfoPoly(){
        System.out.println("Hi I am Teacher!");
    }
}
class StudentPoly extends Day3_PersonPoly{
    public void displayInfoPoly(){
        System.out.println("Hi I am student!");
    }
}

