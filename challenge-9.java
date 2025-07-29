class Array
{

public static int getIndex(int value,int idx ,int maxi[])
{

System.out.println(value +" --  "+idx);
int max=Integer.MIN_VALUE;
int index=idx;
if((idx+value)>=maxi.length-1)
{
return -1;
}

for(int i=idx+1;i<=idx+value;i++)
{
System.out.println(max+" < "+maxi[i]);
if(max<maxi[i])
{
index=i;
max=maxi[i];
}
}
if(max==0)
{
return -2;
}
return index;
}

public static int getPath(int arr[])
{


if(arr[0]==0 ||arr.length==0)
{
return -1;

}

int maxi[]=new int[arr.length];
for(int i=0;i<arr.length;i++)
{
int maxVal=arr[i]+i;
maxi[i]=maxVal;
}

int count=0;

for(int i=0;i<arr.length;i++)
{
int index=getIndex(arr[i],i,maxi);
System.out.println("index : "+index);
if(index==-2)
{
return -1;
}
if(index==-1)
{
return ++count;
}
else
{
i=index-1;
count++;
}

}


return 0;

}
public static void main(String args[])
{
int arr[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
int path=getPath(arr);
System.out.print(path);

}

}