package LEETCODE_DAILY;

    class Solution {
        public int findNumbers(int[] nums) {
            int count=0;
            int len;
            for(int i=0;i<nums.length;i++)
            {
                String str=Integer.toString(nums[i]);
                len=str.length();
                if(len%2==0)
                {
                    count+=1;
                }
            }
            return count;
        }
    }

