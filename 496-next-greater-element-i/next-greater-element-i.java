class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[]next=new int[n1];


        for(int i=0;i<n1;i++){
            int pos=-1;
            for(int j=0 ;j<n2 ; j++){
                if(nums2[j]==nums1[i]){
                    pos=j;
                    break;
                }
            }
            next[i]=-1;
            for(int k=pos+1;k<n2;k++){
            if(nums2[k]>nums2[pos]){
                next[i]=nums2[k];
                break;
            }
        }
           
        }
        
        
        
        return next;
        
    }
}