public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int BinarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]){
                high = mid - 1;
            }else if (key == list[mid]){
                return mid;
            }else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(BinarySearch(list, 2));  /* 0 */
        System.out.println(BinarySearch(list, 4)); /* 4 */
        System.out.println(BinarySearch(list, 7)); /*12 */
        System.out.println(BinarySearch(list, 10));  /*-1 */
        System.out.println(BinarySearch(list, 11));  /*-1 */
        System.out.println(BinarySearch(list, 45));  /*-1 */
        System.out.println(BinarySearch(list, 50));  /*-1 */
        System.out.println(BinarySearch(list, 59));  /*-1 */
        System.out.println(BinarySearch(list, 60)); /*-1 */
        System.out.println(BinarySearch(list, 66)); /*-1 */
        System.out.println(BinarySearch(list, 69)); /*-1 */
        System.out.println(BinarySearch(list, 70)); /*-1 */
        System.out.println(BinarySearch(list, 79)); /*-1 */
    }
    
}
