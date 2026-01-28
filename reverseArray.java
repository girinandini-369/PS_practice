import java.util.*;

class reverseArray {

    // Method to reverse an array
    public void reverseArray(int arr[]) {
        int s = 0;
        int e = arr.length - 1;
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         reverseArray sol = new  reverseArray();

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array: " + Arrays.toString(arr));

        sol.reverseArray(arr);

        System.out.println("Reversed array: " + Arrays.toString(arr));

        sc.close();
    }
}
