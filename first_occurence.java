import java.util.Scanner;

public class first_occurence {
    static int find(int arr[],int low,int high,int data)
    {
        int mid;
        mid=low+(high-low)/2;
        if( (mid==low && arr[mid]==data) || (arr[mid]==data && arr[mid-1]<data) )
        {
            return mid;
        }
        if (arr[mid] >= data)
            return find(arr,low,mid,data);
        else
            return find(arr,mid+1,high,data);
    }
    static int last_occurence(int arr[],int low,int high,int data)
    {
        int mid;
        mid=low+(high-low)/2;
        //System.out.println(mid + " " + arr[mid] + " " + arr[mid+1]);
        if((mid==high && arr[mid]==data) || (arr[mid]==data && arr[mid+1]>data))
            return mid;
        if(arr[mid]<=data)
            return last_occurence(arr,mid+1,high,data);
        else
            return last_occurence(arr,low,mid,data);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int p = sc.nextInt();
        int arr[]=new int[p];
        System.out.println("Enter the elements");
        for(int i=0;i<p;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be found");
        int val=sc.nextInt();
        int res=find(arr,0,p,val);
        System.out.println("The first occurence of data is " + res);
        int res1=last_occurence(arr,0,p,val);
        System.out.println("The last occurence of data is " + res1);
        int res2=res1-res+1;
        System.out.println("Number of occurences of data is " + res2);
    }

}

