class Solution {
    public int minimumSum(int num) {
        int [] arr=new int [4];
        int plus=0;
        while(num>0){
            int digit=num%10;
            arr[plus++]=digit;
            num=num/10;
        }
        Arrays.sort(arr);
        int sum=0;
        String []arr2=new String[2];
        for(int i=0;i<2;i++){
            arr2[i]=String.valueOf(arr[i])+String.valueOf(arr[i+2]);
        }
        return Integer.parseInt(arr2[0])+Integer.parseInt(arr2[1]);

        


        
    }
}