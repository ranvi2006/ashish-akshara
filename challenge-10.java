// Find duplicates in O(n) time and O(n) extra space

class Array
{
public static void main(String args[])
{
int arr[]={1, 2, 3, 6, 3, 6, 1};
int freq[]=new int[arr.length];

for(int i=0;i<arr.length;i++)
{
freq[arr[i]]=freq[arr[i]]+1;
}

for(int i=0;i<freq.length;i++)
{
if(freq[i]!=0 && freq[i]!=1)
{
System.out.print(i +" ");
}
}
}



}