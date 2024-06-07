import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to remove duplicates");
        String s1 = sc.nextLine();
        String result = "";

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (result.indexOf(c) < 0) {
                result += c;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
