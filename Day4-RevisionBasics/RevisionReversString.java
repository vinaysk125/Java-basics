import java.util.Scanner;
public class RevisionReversString {
    public static void main(String[] args){
        System.out.println("This is RevisionReversString program");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to reverse");

        String name = sc.nextLine();

        char[] str = name.toCharArray();

        int start = 0;
        int end = name.length() - 1;


        while(start <  end){
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        sc.close();
        System.out.println(str);
    }
}
