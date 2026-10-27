class Solution {
    public int countValidPrefixes(String s) {
        int prefix=0;
        int ones=0;
        int zeros=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                zeros++;
            }else{
                zeros--;
            }
            if(zeros<=1 && zeros>-2){
                prefix++;
            }

        }
        return prefix;
        
    }
}