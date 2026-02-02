public class rotateArray {

    // Rotate array by k positions, left or right
    static void rotateArr(int[] arr, int k, String dir) {
        int n = arr.length;
        if (n == 0) return;

        k = k % n;
        if (k == 0) return;

        if (dir.equals("L")) {
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
            reverse(arr, 0, n - 1);
        } else if (dir.equals("R")) {
            reverse(arr, 0, n - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
        } else {
            System.out.println("Invalid direction! Use 'L' or 'R'");
        }
    }

    static void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    static void printArr(int[] arr) {
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.print("Left rotation: ");
        rotateArr(arr, k, "L");
        printArr(arr);  // Output: 3 4 5 1 2

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.print("Right rotation: ");
        rotateArr(arr2, k, "R");
        printArr(arr2); // Output: 4 5 1 2 3
    }
}
