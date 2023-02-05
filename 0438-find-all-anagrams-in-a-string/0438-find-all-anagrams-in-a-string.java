class Solution {    
    public List<Integer> findAnagrams(String s, String p) {
        
        List<Integer> result = new ArrayList<>();
        if(s.length() < p.length()){
            return result;
        }
        int[] arrs = new int[26];
        int[] arrp = new int[26];
        
        for(int i = 0; i < p.length(); i++){
            arrs[s.charAt(i) - 'a']++;
            arrp[p.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i <= s.length() - p.length(); i++){
            if(isequal(arrs, arrp)){
                result.add(i);
            }
            arrs[s.charAt(i) - 'a']--;
            if(i + p.length() < s.length()){
                arrs[s.charAt(i + p.length()) - 'a']++;
            }
        }
        
        
        return result;
    }
    
    public boolean isequal(int[] arrs, int[] arrp){
        for(int i = 0; i < 26; i++){
            if(arrs[i] != arrp[i]){
                return false;
            }
        }
        return true;
    }
    
}