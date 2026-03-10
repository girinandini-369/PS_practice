import java.util.Arrays;
import java.util.Scanner;

public class PushZeros {

    // Function to push zeros to the end
    public static void pushZerosToEnd(int[] arr) {
        int c = 0; // index for next non-zero element

        // Move all non-zero elements to front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[c] = arr[i];
                c++;
            }
        }

        // Fill remaining positions with zeros
        while (c < arr.length) {
            arr[c] = 0;
            c++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        pushZerosToEnd(arr); // call function

        System.out.println("Array after pushing zeros to end:");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
