class Solution {
    public String replaceDigits(String s) {
        int n=s.length();
        boolean odd=false;
        if(n%2!=0){
            odd=true;

        }
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<n;i+=2){
            int temp=s.charAt(i-1) -'a';
            int digit =s.charAt(i)-'0';
            char tempchar=(char)('a'+ temp+digit);
            sb.append(s.charAt(i-1));
            sb.append(tempchar);

        }
        if(odd){
            sb.append(s.charAt(n-1));
        }
        return sb.toString();
        
    }
}