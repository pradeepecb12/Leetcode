class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len=Math.min(word1.length(),word2.length());
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<len;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));

        }
        int n=word1.length(),m=word2.length();
        if(n!=m){
            if(n>m){
            sb.append(word1.substring(m,n));
            }else{
            sb.append(word2.substring(n,m));
            }
        }
        return sb.toString();
        
    }
}

