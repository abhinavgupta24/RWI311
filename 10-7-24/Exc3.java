public class Exc3 {
    public static void main(String[] args) {
        int b = 3;
        String c = "Abhinav";
        try {
            System.out.println(b);
            System.out.println(b / 0);
            System.out.println(c);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Hello world");
    }
}
