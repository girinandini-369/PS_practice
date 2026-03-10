import java.util.*;

public class day1 {
    public static  int getSecondLargest(int[] arr) {
        int first=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==first||arr[i]==second)
                continue;
            else if(arr[i]>first)
            {
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second)
            {
                second=arr[i];
            }
        }
        if(second==Integer.MIN_VALUE)
            return -1;
        else
            return second;
    }

    public static void main(String[] args) {
      
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Second Largest: " +getSecondLargest(arr));
    }
}
