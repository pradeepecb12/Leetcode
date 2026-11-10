class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        String out="";
        int max=0;
        if(s.length()<2){
            return s;

        }


        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if( ispalindrome(s.substring(i,j+1))){
                    int temp=j-i+1;
                    if(temp>max){
                        max=temp;
                        out=s.substring(i,j+1);
                    }

                }

            }
            
            
            
            
        }
        return out;
        
    }

    static boolean ispalindrome(String temp){
        int left=0;
        int right=temp.length()-1;
        while(left<=right){
            if(temp.charAt(left)!=temp.charAt(right)){
                return false;
            }
            left++;
            right--;

        }
        return true;
    }
}