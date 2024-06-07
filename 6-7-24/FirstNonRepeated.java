import java.util.Scanner;

public class FirstNonRepeated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        str = str.toLowerCase();
        char firstNonRepeatCh = '\0';

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (str.indexOf(c) == str.lastIndexOf(c)) {
                firstNonRepeatCh = c;
                break;
            }
        }

        if (firstNonRepeatCh != '\0') {
            System.out.println("The first non-repeated character is: " + firstNonRepeatCh);
        } else {
            System.out.println("All characters are repeated.");
        }
        sc.close();
    }
}
