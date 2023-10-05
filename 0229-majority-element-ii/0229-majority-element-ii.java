class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int criteria = nums.length / 3;
        for(int i : nums){
            if(map.getOrDefault(i, -1) == -1){
             map.put(i, 1);   
            }
            else {
             map.computeIfPresent(i, (k,v) -> v+1);    
            }
            
        }
        System.out.println(map);
        for(Integer i : map.keySet()){
            if(map.get(i) > criteria){
                result.add(i);
            }
        }
        System.out.println(result);
        return result;
    }
}