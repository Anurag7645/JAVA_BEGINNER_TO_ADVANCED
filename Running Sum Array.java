class Solutions{    
    public int[] Solutions.main(int[] nums) {
        int[] results = new int[nums.length];
        results[0]=nums[0];

        for (int i=1;i < nums.length;i++){
            results[i]=results[i-1]+nums[i];

        }
        return results;
 
    }

}
