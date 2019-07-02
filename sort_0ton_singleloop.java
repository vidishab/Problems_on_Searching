public class sort_0ton_singleloop {
    static void find(int arr[])
    {
        int n=arr.length-1;
        for(int i=0;i<=n;i++)
        {
            if(arr[i]!=i)
            {
                int t=arr[arr[i]];
                arr[arr[i]]=arr[i];
                arr[i]=t;
            }
        }
        for(int i=0;i<=n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[])
    {
        int arr[]={0,4,3,1,2};
        find(arr);
    }
}

