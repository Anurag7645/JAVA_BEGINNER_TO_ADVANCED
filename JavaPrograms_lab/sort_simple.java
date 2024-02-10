class sort_simple
{
public static void main(String args[])
{
int arr[]={3,1,8,2,4};
int temp;
for(int i=0;i<arr.length-1;i++)
{
for(int j=0;j<arr.length-i-1;j++)
{
if(arr[j]>arr[j+1])
{
temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]);
}
}
}