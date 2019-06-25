import java.util.Hashtable;
import java.util.Scanner;

public class finding_duplicates_array {
    static void finddup(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicate found");
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
    static int[] mergei(int arr[],int temp[],int low, int mid, int high)
    {
        int temp_pos,size,left_end;
        temp_pos=low;
        left_end=mid-1;
        size=high-low+1;
        while ((low<=left_end) && (mid <= high))
        {
            if(arr[low]<= arr[mid])
            {
                temp[temp_pos]=arr[low];
                temp_pos+=1;
                low+=1;
            }
            else
            {
                temp[temp_pos]=arr[mid];
                temp_pos+=1;
                mid+=1;
            }
        }
        while (low <= left_end)
        {
            temp[temp_pos]=arr[low];
            temp_pos+=1;
            low+=1;
        }
        while (mid <= high)
        {
            temp[temp_pos]=arr[mid];
            temp_pos+=1;
            mid+=1;
        }
        for(int i=0;i<size;i++)
        {
            arr[high]=temp[high];
            high-=1;
        }
        return arr;
    }
    static int[] ms(int arr[],int temp[],int low,int high)
    {
        int mid;
        if(high > low)
        {
            mid=(high+low)/2;
            ms(arr,temp,low,mid);
            ms(arr,temp,mid+1,high);
            arr=mergei(arr,temp,low,mid+1,high);
        }
        return arr;
    }
    static void finddup1(int arr[])
    {
        int n=arr.length;
        int temp[]=new int[n];
        arr=ms(arr,temp,0,n-1);
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                System.out.println("Duplicate found " + arr[i]);
            }
        }
    }
    static void finddup2(int arr[])
    {
        Hashtable<Integer,Integer> ht = new Hashtable<Integer,Integer>();
        for(int i=0;i<arr.length;i++)
        {
            ht.put(arr[i],0);
        }
        for(int i=0;i<arr.length;i++)
        {
            if(ht.get(arr[i])==0)
                ht.replace(arr[i],1);
            else
                System.out.println("Duplicate Found in HT " + arr[i]);
        }
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
        finddup(arr);
        finddup1(arr);
        finddup2(arr);
    }
}

