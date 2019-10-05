import java.util.Scanner;

public class Q3{
    private String string3;

    public String getString() { return string3;}

    public void setString(String string) { this.string3 = string;}

    public void ReplaceVowel(String string){
        this.string3 = string;
    }
    public void Display(){
        String s1 =  getString().toLowerCase();
        char[] chars = s1.toCharArray();
        for (int i = 0; i <getString().length() ; i++) {
            if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u'){
                chars[i] = '*';
            }

        }
        String s2 = new String(chars);
        System.out.println(s2);
    }
}

class Main1 {
    public static void main(String[] args) {
        System.out.println("enter any string : ");
        Scanner scanner = new Scanner(System.in);
        Q3 obj = new Q3();
        obj.ReplaceVowel(scanner.nextLine().trim());
        obj.Display();
    }
}