public class Array4 {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int searchEle = 20;
        int first = 0;
        int last = arr.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < searchEle) {
                first = mid + 1;
            } else if (arr[mid] == searchEle) {
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }
}
