public class Array1 {
    public static void main(String[] args) {
        int[] arr = { -3, 61, -7, -8, -17, -1 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The maximum element is " + max);
    }
}
