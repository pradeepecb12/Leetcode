class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        int n=nums.length;
        for(int i=0;i<=n;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return -1;

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