

import java.util.Scanner;

public class Problem_rotation {
    static int getpos(int m[],int p[],int val,int t, int t1)
    {
        int c=0;
        if(val < m[c])
        {
            for(int i=0;i<p.length;i++)
            {
                if(p[i]==val)
                    return (i+1+t);
            }
        }
        else
        {
            for(int i=0;i<m.length;i++)
            {
                if(m[i]==val)
                    return(i+1);
            }
        }
        return -1;
    }
    static int find(int n[])
    {
        int first=0;
        int last=n.length-1;
        while (first<=last)
        {
            if(first==last)
                return first;
            else if(first==last-1)
                return Math.max(n[first],n[last]);
            else
            {
                int mid=first+(last-first)/2;
                //System.out.println(n[mid]);
                if(n[mid-1] > n[mid] && n[mid] < n[mid+1])
                    return mid;
                if(n[mid-1]<n[mid] && n[mid]<n[mid+1])
                    first=mid-1;
                if(n[mid-1]>n[mid] && n[mid]>n[mid+1])
                    last=mid+1;
            }

        }
        return 0;
    }
    public static void main(String args[])
    {
        int count=0,t=0,t1=0;
        int n[]={15,16,19,20,25,1,3,4,5,7,10,14};
        int c=n.length;
        int m[] = new int[c];
        int p[]=new int[c];
        //System.out.println(c);
        int r = find(n);
        System.out.println(r);
        for(int i=0;i<c && i<r;i++,count++)
        {
            m[i]=n[i];
            System.out.println(m[i]);
            t++;
        }
        for(int i=0;i<c && count<n.length;i++,count++)
        {
            p[i]=n[count];
            System.out.println(p[i]);
            t1++;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value to be found");
        int val=sc.nextInt();
        System.out.println(getpos(m,p,val,t,t1));
    }
}

