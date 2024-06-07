public class StringFunctions1 {
    static String concatString(String s1, String s2) {
        return s1.concat(s2);
    }

    static boolean compareString(String s1, String s2) {
        if (s1.equals(s2)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = new String("Hello ");
        String s2 = new String("world");
        System.out.println(concatString(s1, s2));
        System.out.println(compareString("Hello", "Hello"));
    }
}
