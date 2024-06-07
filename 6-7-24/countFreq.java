import java.util.Scanner;

public class countFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s1 = sc.nextLine();
        s1 = s1.toLowerCase();

        for (char c = 'a'; c <= 'z'; c++) {
            int count = s1.length() - s1.replace(Character.toString(c), "").length();
            if (count > 0) {
                System.out.println(c + " : " + count);
            }
        }
        sc.close();
    }
}