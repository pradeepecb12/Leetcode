class Solution {
    public String rearrangeString(String s, char x, char y) {
        int n=s.length();
        int count=0;
        String temp="";
        for(int i=0;i<n;i++){
            if(s.charAt(i)==x){
                count++;
            }
            else{
                temp+=s.charAt(i);
            }
        }
        for(int i=0;i<count;i++){
            temp+=x;
        }
        return temp;
        
    }
}