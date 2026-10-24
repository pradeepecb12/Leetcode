class Solution {
    public int differenceOfSum(int[] nums) {
        int digitsum=0;
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(nums[i]>9){
                int set=nums[i];
                int temp=0;
                while(set>0){
                    int digit=set%10;
                    temp+=digit;
                    set=set/10;
                }
                digitsum+=temp;

            }else{
                digitsum+=nums[i];
            }
        }
        return Math.abs(digitsum-sum);  
    }
}