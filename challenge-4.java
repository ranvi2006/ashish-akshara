class Array
{
public static void main(String args[])
{
int arr[]={0,1,2,0,1,2};
int zero=0;
int one=0;
int two=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]==0)
{
zero++;
}
else if(arr[i]==1)
{
one++;
}
else if(arr[i]==2)
{
two++;
}
}
for(int i=0;i<arr.length;i++)
{
while(zero>0)
{
arr[i]=0;
zero--;
i++;
}
while(one>0)
{
arr[i]=1;
one--;
i++;
}
while(two>0)
{
arr[i]=2;
two--;
i++;
}

}

for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}

}

}