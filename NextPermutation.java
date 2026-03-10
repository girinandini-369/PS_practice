import java.util.Arrays;

public class NextPermutation {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {3, 2, 1};
        int[] arr3 = {1, 1, 5};

        nextPermutation(arr1);
        System.out.println(Arrays.toString(arr1));

        nextPermutation(arr2);
        System.out.println(Arrays.toString(arr2));

        nextPermutation(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Step 1: find breakpoint
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: if breakpoint exists
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: reverse suffix
        reverse(nums, i + 1, n - 1);
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left++, right--);
        }
    }
}
