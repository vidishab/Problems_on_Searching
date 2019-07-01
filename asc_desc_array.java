public class asc_desc_array {
    static int find(int arr[])
    {
        int first=0;
        int last=arr.length-1;
        while(first<=last) {
            if (first == last)
                return first;
            else if (first == last - 1)
                return Math.max(arr[first], arr[last]);
            else {
                int mid = first + ((last - first) / 2);
                if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid+1])
                    return arr[mid];
                else if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid+1])
                    first = mid - 1;
                else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid+1])
                    last = mid + 1;
            }
        }
        return 0;
    }
    public static void main(String args[])
    {
        int n[]={-4,-3,-2,5,4,3,2,1};
        int n1[]={2};
        int n2[]={4,5};
        System.out.println(find(n));
    }
}

