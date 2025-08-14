public class PrintStarPattern {
    public static void main(String[] args) {

        System.out.println("This is PrintStarPattern program.");


        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//         Reverse start pattern
//        for (int i = 1; i <= 5; i++){
//        for (int j = 5; j >= i; j--){
//        System.out.print("*");
//            }
//                    System.out.println();