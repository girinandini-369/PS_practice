import java.util.HashSet;

public class march9_03 {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;   // duplicate found
            }
            seen.add(num);
        }
        return false;  // no duplicates
    }

    public static void main(String[] args) {
        march9_03 sol = new march9_03();

        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {100, 200, -100, -200, 300, -300, 400, -400, 500, -500, 600, -600, 700, -700, 800, -800, 900, -900, 1000, -1000, 100};

        System.out.println("nums1 has duplicate? " + sol.hasDuplicate(nums1)); // true
        System.out.println("nums2 has duplicate? " + sol.hasDuplicate(nums2)); // false
        System.out.println("nums3 has duplicate? " + sol.hasDuplicate(nums3)); // true
    }
}