class Array
{
public static void main(String args[])
{
int arr[]={3,5,4,-3,9};
int max=Integer.MIN_VALUE;
int min=Integer.MAX_VALUE;

for(int i=0;i<arr.length;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
if(arr[i]<min)
{
min=arr[i];
}
}

System.out.print(max+","+min);
}

}