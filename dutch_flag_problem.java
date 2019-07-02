public class dutch_flag_problem {
    static void swap(int arr[],int low,int high)
    {
        int temp=arr[low];
        arr[low]=arr[high];
        arr[high]=temp;
        //System.out.println(arr[low] + " " + arr[high]);
    }
    static void find2(int arr[])
    {
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while (mid<=high)
        {
            switch (arr[mid])
            {
                case 0:
                    swap(arr,low,mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(arr,mid,high);
                    high--;
                    break;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void find(int arr[])
    {
        int n = arr.length-1;
        int low = 0;
        int high = n;
        while(low < high)
        {
            while(arr[low]==0)
            {
                low=low+1;
            }
            while(arr[high]==1)
            {
                high=high-1;
            }
            swap(arr,low,high);
            low++;
            high--;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void find1(int arr[])
    {
        int n = arr.length-1;
        int low=0;
        int high=n-1;
        while (low < high)
        {
            while (arr[low]%2==0)
            {
                low=low+1;
            }
            while (arr[high]%2==1)
            {
                high=high-1;
            }
            swap(arr,low,high);
            low++;
            high--;
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[]={1,0,0,1,0,0,1,1,0};
        int arr1[]={2,3,4,5,6,7,8,9};
        int arr2[]={0,2,1,0,0,1,1,2,1};
        find(arr);
        find1(arr1);
        find2(arr2);
    }
}

