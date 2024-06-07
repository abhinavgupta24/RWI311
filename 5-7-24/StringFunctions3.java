import java.util.Scanner;

public class StringFunctions3 {
    static void charAtString(String s1, int i) {
        System.out.println(s1.charAt(i));
    }

    static void seqExsist(String s1, String s2) {
        if (s1.contains(s2)) {
            System.out.println(s2 + " Sequence present in " + s1);
        } else {
            System.out.println(s2 + " not present in " + s1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s1 = sc.next();
        System.out.println("enter the index to find element ");
        int i = sc.nextInt();
        charAtString(s1, i);

        System.out.println("Enter string");
        String s2 = sc.next();

        System.out.println("Enter string to check if it is present in " + s2);
        String s3 = sc.next();
        seqExsist(s2, s3);
        sc.close();
    }
}