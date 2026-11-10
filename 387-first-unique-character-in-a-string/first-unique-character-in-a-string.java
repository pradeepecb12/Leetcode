class Solution {
    public int firstUniqChar(String s) {
        int index=-1;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.indexOf(ch)==s.lastIndexOf(ch)){
                index=i;
                break;
            }
        }
        return index;


        
    }
}