import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to reverse");
        String s1 = sc.nextLine();
        String s2[] = s1.split("");
        String s3 = "";
        for (int i = s2.length - 1; i >= 0; i--) {
            s3 = s3 + s2[i];
        }
        System.out.println(s3);
        sc.close();
    }

}
