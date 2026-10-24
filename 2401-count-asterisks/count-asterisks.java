class Solution {
    public int countAsterisks(String s) {
        int n=s.length();
        int set=0;
        int count=0;
        boolean istrue=false;
        for(int i=0;i<n;i++){
            if(!istrue  && s.charAt(i)=='*'){
                count++;
            }else{
                if(s.charAt(i)=='|' ){
                    if(istrue){
                        istrue=false;
                    }else{
                        istrue=true;
                    }
                }
            }
        }
        return count;
        
    }
}