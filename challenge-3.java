class Array
{
public static void main(String args[])
{
int arr[]={7,10,4,3,20,15};
int k=3;
for(int i=0;i<k;i++)
{
for(int j=i+1;j<arr.length;j++)
{
if(arr[j]<arr[i])
{
int tem=arr[i];
arr[i]=arr[j];
arr[j]=tem;
}
}

}

System.out.print(arr[k-1]);

}

}