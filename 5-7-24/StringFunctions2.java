import java.util.Scanner;

public class StringFunctions2 {
    static String upperString(String s1) {
        return s1.toUpperCase();
    }

    static String lowerString(String s1) {
        return s1.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to convert to upper case");
        String st = sc.nextLine();
        System.out.println(upperString(st));
        System.out.println("Enter the string to convert to lower case");
        String st1 = sc.nextLine();
        System.out.println(lowerString(st1));
        sc.close();
    }
}
