class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int ithink=n *(n+1)/2;
        int sum=0;
        for(int x:nums){
            sum+=x;
        }
        return ithink-sum;

        /**int []arr1=new int[n+1];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=i;
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<list.size();i++){
            if(arr1[i]!=list.get(i)){
                val=arr1[i];

            }
        }
        return val;

        /**
        int n=nums.length;
        int nut=0;
        
        int[]val=new int[n+1];
        for(int i=0;i<n+1;i++){
            val[i]=i;
        }
        Arrays.sort(nums);
        Arrays.sort(val);
        int minus=val.length-nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val[i]){
                nut=val[i];
            }else if(nums.length<val.length){
                nut=val[val.length-1];
            }
 
        }
        return nut;
        
    */
    }
}