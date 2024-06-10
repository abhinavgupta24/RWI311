public class Exc1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 0;
        try {
            System.out.println(a);
            System.out.println(b);
            System.out.println(a / c);
            System.out.println(b / a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
