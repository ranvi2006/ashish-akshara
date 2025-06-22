class Array
{
public static void main(String args[])
{
int arr[]={1,4,3,2,6,5,7};
int end=arr.length/2;
for(int i=0;i<end;i++)
{
int tem=arr[i];
arr[i]=arr[arr.length-1-i];
arr[arr.length-1-i]=tem;
}
}
}