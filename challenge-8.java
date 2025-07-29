class Array
{
public static void main(String args[])
{
int arr[]={5, 4, 1, 7, 8};
int res[]=new int[arr.length];
for(int i=0;i<arr.length;i++)
{
int max=Integer.MIN_VALUE;
int sum=0;
for(int j=i;j<arr.length;j++)
{
sum=sum+arr[j];
if(sum>max)
{
max=sum;
}
}
res[i]=max;

}

int maxi=Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++)
{
if(res[i]>maxi)
{
maxi=res[i];
}
}

System.out.print("Maximum Value "+maxi);

}

}