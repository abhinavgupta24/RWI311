import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = { 3, 1, 8, 4, 0, 2 };
        int index = 0;
        Boolean flag = false;
        System.out.println("Enter element to search");
        int searchEle = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == searchEle) {
                index = i;
                flag = true;
            }
        }
        if (flag) {
            System.out.println("element found at location " + index);
        } else {
            System.out.println("element cannot be found");
        }
        sc.close();

    }
}
