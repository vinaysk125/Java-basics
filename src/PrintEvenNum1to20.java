public class PrintEvenNum1to20 {
    public static void main(String[] args){

        System.out.println("This is PrintEvnNum1to20 program.");

        for (int i=1; i<=20; i++){
            if (i%2 == 0){
                System.out.println(i);
            } else {
                continue;
            }
        }
    }
}
