//Union and Intersection of Two Unsorted Arrays - Complete Tutorial

public class Array {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 2, 1 ,5};
        int b[] = { 3, 2, 2, 3, 2,5 };
        int union[] = new int[a.length + b.length];
        int idx=-1;
        for(int i=0;i<a.length;i++)
        {
            boolean isPresent=false;
            for(int j=0;j<union.length;j++)
            {
            if(a[i]==union[j])
            {
                isPresent=true;
            }
            }
            if(!isPresent)
{
System.out.print(a[i]+" ");
            union[++idx]=a[i];
}
        }

        for(int i=0;i<b.length;i++)
        {
            boolean isPresent=false;
            for(int j=0;j<union.length;j++)
            {
            if(b[i]==union[j])
            {
                isPresent=true;
            }
            }
            if(!isPresent)
{
System.out.print(b[i]+" ");
            union[++idx]=b[i];
}
        }

    }
}