import java.util.Scanner;

public class RemoveLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLowerCase(c)) {
                result += c;
            }
        }
        System.out.println(result);
        sc.close();
    }
}