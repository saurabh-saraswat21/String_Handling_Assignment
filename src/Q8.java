import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        System.out.println("enter any string: ");
        Scanner scanner = new Scanner(System.in);
        String str8 = new String(scanner.nextLine());
        str8 = str8.toUpperCase();
        int weight =0;
        for (int i = 0; i < str8.length() ; i++) {
            weight = weight + (int)str8.charAt(i);
        }
        System.out.println("entered string in uppercase: "+weight);
    }
}
