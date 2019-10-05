import java.util.Scanner;
public class Q7{
    private String string7;
    private int weight;

    public void setWeight(int weight) { this.weight = weight; }

    public int getWeight() { return weight; }

    public void setString7(String string7) { this.string7 = string7;}

    public String getString7() { return string7;}

    public void Stringweight_Ans_7(String string7){
        this.string7=string7;
    }
    public int weight(){
        String str7 = getString7();
        setWeight(0);
        for (int i = 0; i < getString7().length() ; i++) {
            weight = weight + (int)(str7.charAt(i));
        }
        return weight;
    }

}

class Main7{
    public static void main(String[] args) {
        System.out.println("enter any string: ");
        Scanner scanner = new Scanner(System.in);
        Q7 obj7 = new Q7();
        obj7.Stringweight_Ans_7(scanner.nextLine().trim());
        System.out.println(obj7.weight());
    }
}