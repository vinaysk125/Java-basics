package Week1;

public class Day1_ControlFlow {
    public static void main(String[] args){

        // largest three number
        int a=112, b=42, c=342;

        if(a>b && a>c) {
            System.out.println("a is greater that b and c");
        } else if(b>a && b>c){
            System.out.println("b is greater than a and c");
        } else {
            System.out.println("c is greater than a and b");
        }

        // Number is even or odd
        int d=45;

        if(d%2 == 0){
            System.out.println(d + " is even");
        } else{
            System.out.println(d + " is odd");
        }

        // Switch: print weekday name from number (1–7)

        int day = 8;

        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Provided wrong input");
        }
    }
}
