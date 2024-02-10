class elements
{
public static void main(String args[])
{
int arr[]={4,3,2,5,1};
int maxi=0;
int mini=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]>arr[0])
{
maxi=arr[i];
}
if(arr[i]<arr[0])
{
mini=arr[i];
}
}
System.out.println(maxi);
System.out.println(mini);
}
}