class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;

        Map<String,List<String>> map=new HashMap<>();

        for(String temp:strs){

            char [] arr=temp.toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(temp);
        }

        return new ArrayList<>(map.values());
        




        
    }
}


