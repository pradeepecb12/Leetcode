class Solution {
    public int minAddToMakeValid(String s) {
        int n=s.length();
        Stack<Character> open=new Stack<>();
        int temp=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                open.push(ch);
            }else if(ch==')' && !open.isEmpty()){
                open.pop();

            }else if(open.isEmpty() && ch==')'){
                temp++;
            }   
        }
        return open.size()+temp; 
    }
}