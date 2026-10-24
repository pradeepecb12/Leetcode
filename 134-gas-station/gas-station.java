class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n =gas.length;
        int contains=0;
        int tank=0;
        int index=0;
        for (int i = 0; i < gas.length; i++) {
            int curr = gas[i] - cost[i];
            contains+=curr;
            tank += curr;
            if(tank<0) {
                index= i+1;
                tank= 0;
            }
        }
        return contains< 0 ? -1:index;
        
        
        
    }
}