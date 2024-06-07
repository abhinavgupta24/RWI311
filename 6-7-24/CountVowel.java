import java.util.Scanner;

public class CountVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String s1 = sc.nextLine();
        int vowelCount = 0;

        for (int i = 0; i < s1.length(); i++) {
            char c = Character.toLowerCase(s1.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);

        sc.close();
    }
}
