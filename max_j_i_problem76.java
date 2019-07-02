
import java.util.Scanner;

public class max_j_i_problem76 {
    static void find(int arr[])
    {
        int max_diff=-1;
        int n = arr.length-1;
        for(int i=0;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                if(arr[j] > arr[i] && max_diff<(j-i))
                {
                    max_diff=j-i;
                }
            }
        }
        System.out.println(max_diff);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int p = sc.nextInt();
        int arr[]=new int[p];
        System.out.println("Enter the elements");
        for(int i=0;i<p;i++)
        {
            arr[i]=sc.nextInt();
        }
        find(arr);
    }
}

