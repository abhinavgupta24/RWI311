import java.util.Scanner;

public class CountLowerAndUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int upperCount = 0;
        int lowerCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                upperCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCount++;
            }
        }
        System.out.println("Number of uppercase " + upperCount);
        System.out.println("Number of lowercase " + lowerCount);
        sc.close();
    }
}
