class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String > res=new ArrayList<>(Arrays.asList(words));

        boolean istrue=true;

        while(istrue ){
            istrue=false;
            

            for(int i=1;i<res.size();i++){
                char [] first=res.get(i-1).toCharArray();
                char [] last=res.get(i).toCharArray();
                Arrays.sort(first);
                Arrays.sort(last);

                if(Arrays.equals(first,last)){
                    res.remove(i);
                    istrue=true;
                    
                

                }
            }
            
        }
        return res;
        
    }
}