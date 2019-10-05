import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str =obj.next();
        String substring =obj.next().trim();
        String str2 = obj.nextLine();
        String newstr = obj.nextLine();
        System.out.println(str.replace(substring,newstr));
    }

}

