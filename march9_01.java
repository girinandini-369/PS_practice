import java.util.Scanner;

class march9_01 {
    public int scoreOfString(String s) {
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int cur = (int) s.charAt(i);
            int next = (int) s.charAt(i + 1);
            int sub = next - cur;
            sum += Math.abs(sub);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        march9_01 sol = new march9_01();  // Fixed the class name
        int result = sol.scoreOfString(input);
        System.out.println("Score of the string: " + result);

        sc.close();
    }
}