public class welthy {
    static void main()
    public int maximumWealth(int[][] accounts){
        int maxWealthsofar=0;

        for(int[] customer : accounts){
            int currentCustomerwealth=0;

            for (int bank:customer){
                currentCustomerwealth+=bank;
            }
            maxWealthsofar=Math.max(maxWealthsofar,currentCustomerwealth);
        }
        return maxWealthsofar;
    }
}
