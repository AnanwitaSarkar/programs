import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class subarray_with_0_sum {
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();

            GfG g = new GfG();
            System.out.println(g.maxLen(arr, n));
            T--;
        }
    }
}// } Driver Code Ends


class GfG
{
    int maxLen(int arr[], int n) {
        // Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        int len = 0,sum = 0;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
            if(sum==0)
                len=i+1;
            Integer integer=map.get(sum);
            if(integer==null)
                map.put(sum,i);
            else
                len=Math.max(len,i-integer);
        }
        return len;
    }
}
