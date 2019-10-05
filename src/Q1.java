import java.util.Scanner;

public class Q1 {


    private String string1;

    public String getString() {
        return string1;
    }

    public void setString(String string) {
        this.string1 = string;
    }
    public void Print_String(String string){
        this.string1=string;
    }
    public void Display(){
        char[] s = getString().toCharArray();
        System.out.print("index:");
        for (int i = 0; i <getString().length() ; i++) {
            System.out.print("\t"+i);
        }
        System.out.println("");
        System.out.print("chars:");
        for (int i = 0; i <getString().length() ; i++) {
            System.out.print("\t"+s[i]);
        }
    }
}

class InputString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine().trim();
        Q1 obj = new Q1();
        obj.Print_String(x);
        obj.Display();
    }
}
