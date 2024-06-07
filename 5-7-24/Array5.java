import java.util.Scanner;

public class Array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array of " + n + " elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("enter the target sum to achieve");
        int target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (target == a[i] + a[j]) {
                    System.out.println("the sum is possible " + a[i] + " " + a[j]);
                }
            }
        }
        sc.close();
    }
}
