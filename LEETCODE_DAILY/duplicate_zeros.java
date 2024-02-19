package LEETCODE_DAILY;

public class duplicate_zeros {
    class Solution {
        public void duplicateZeros(int[] arr) {
            int res[]=new int[arr.length];
            int var=0;
            if(arr.length<2) {
                System.arraycopy(arr, 0, res, 0, arr.length);
                return;
            }
            for(int i=0;i<arr.length;i++)
            {
                if(var<arr.length)
                {
                if(arr[i]==0)
                {
                    res[var++]=arr[i];
                    res[var++]=0;
                }
                else
                    res[var++]=arr[i];
            }
            }
            for(int i=0;i<arr.length;i++)
            System.out.println(res[i]);
        }
    }
}
