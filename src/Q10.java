import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter String: ");
        String str10 = scanner.next();
        System.out.println("enter any character: ");
        char c = scanner.next().charAt(0);
        System.out.printf("index of %c is ",c);
        System.out.println(str10.indexOf(c));
    }
}
