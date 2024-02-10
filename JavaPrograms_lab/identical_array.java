class identical_array
{
public static void main(String args[])
{
int arr[]={3,1,8,2,4};
int arr1[]={3,1,8,2,4};
int count=0;
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr1.length;j++)
{
if(arr[i]==arr1[j])
{
count++;
}
}
}
if(count==arr.length)
{
System.out.println("Equal");
}
System.out.println("Not");
}
}