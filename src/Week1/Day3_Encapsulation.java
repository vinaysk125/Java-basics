package Week1;

public class Day3_Encapsulation {
        private int studentRollEncapsulation;
        private String studentNameEncapsulation;

        int x;

//        Day3_Encapsulation() {
//            studentRollEncapsulation = 1;
//            studentNameEncapsulation = "Vinay";
//        }

        public String getName(){
            return studentNameEncapsulation;
        }

        public int getStudentRollEncapsulation(){
            return studentRollEncapsulation;
        }

        public void setName(String s) {
            this.studentNameEncapsulation = s;
        }

        public void setStudentRollEncapsulation(int r) { this.studentRollEncapsulation = r; }

        public void displayStudentRollEncapsulation(){
            System.out.println("Student Roll Number = " + studentRollEncapsulation + " Name = " + studentNameEncapsulation);
    }

        public boolean isPrimeNumber (int x){
            int num = x;
            for (int i = 2; i< num /2; i++){
                if (num % i == 0){
                    return false;
                }
            }
            return true;
    }
}
