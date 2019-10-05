import java.util.Scanner;
public class Q9 {

            public static void main(String[] args) {
            System.out.println("enter a string:");
            Scanner scanner = new Scanner(System.in);
            String str9 = scanner.next();
            int upper = 0;
            int lower = 0;
            for (int i = 0; i < str9.length() ; i++) {
                if (Character.isUpperCase(str9.charAt(i))){
                    upper = upper + (int)str9.charAt(i);
                }
                else
                    lower = lower + (int)str9.charAt(i);
            }
            System.out.println("absolute weight : "+Math.abs(upper-lower));
        }
}
