class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            set.add(entry.getValue());
        }
        
        return set.size()>1 ? false:true;
        
    }
}