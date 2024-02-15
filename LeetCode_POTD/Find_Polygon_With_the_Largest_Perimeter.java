package LeetCode_POTD;

import java.util.Arrays;

public class Find_Polygon_With_the_Largest_Perimeter {
     public long largestPerimeter(int[] nums) {
        
        long prefix = Arrays.stream(nums).asLongStream().sum();

        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; --i) 
        {
            prefix -= nums[i];
            if (prefix > nums[i])
                return prefix + nums[i];
        }

        return -1;
    }
}
