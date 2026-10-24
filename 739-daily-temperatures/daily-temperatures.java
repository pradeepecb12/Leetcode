class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int [] fresh=new int [n];
        Stack<Integer> stack=new Stack<>();

 
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int index=stack.pop();
                fresh[index]=i-index;


            }
            stack.push(i);

            
            


        }
        return fresh;
 
        
        






        
        
    }
}