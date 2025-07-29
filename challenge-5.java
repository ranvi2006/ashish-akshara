class Array
{
public static void main(String args[])
{
int arr[]={-12,10,12,11,-13,-5,6,-7,5,-3,-6,-34,-89};
int length=arr.length-1;

for(int i=0;i<length;i++)
{
if(arr[i]>0)
{
while(true)
{
if(arr[length]<0)
{
int tem=arr[length];

arr[length]=arr[i];
arr[i]=tem;
length--;
break;
}
else
{
length--;
}
}
}

}

for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}

}

}