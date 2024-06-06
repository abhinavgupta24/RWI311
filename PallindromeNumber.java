import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is palllindrome");
        long num = sc.nextLong();
        long rem, sum = 0, temp = num;
        while (num > 0) {
            rem = num % 10;
            sum = sum * 10 + rem;
            num = num / 10;
        }
        if (sum == temp) {
            System.out.println("The " + temp + " is pallindrome ");
        } else {
            System.out.println("The " + temp + " is not pallindrome");
        }
        sc.close();
    }
}
