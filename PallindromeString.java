import java.util.Scanner;

public class PallindromeString {
    public static void main(String[] args) {
        String str1, reverse = ""; // Objects of String class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check if it is a pallindrome ");
        str1 = sc.nextLine();
        int length = str1.length();
        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + str1.charAt(i);
        if (str1.equals(reverse))
            System.out.println(str1 + " is a pallindrome.");
        else
            System.out.println(str1 + " isn't a pallindrome.");
        sc.close();
    }
}