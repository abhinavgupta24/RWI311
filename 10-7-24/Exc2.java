public class Exc2 {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[0] = 1;
            a[1] = 2;
            a[2] = 3;
            a[3] = 4;
            a[4] = 5;
            a[5] = 6;
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
