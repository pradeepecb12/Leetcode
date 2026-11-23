class Solution {
    public boolean checkString(String s) {
        boolean istrue=true;
        for(char ch:s.toCharArray()){
            if(ch=='b'){
                istrue=false;
            }else if(!istrue && ch=='a'){
                return false;
            }
            
        }
        return true;
        
    }
}