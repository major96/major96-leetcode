class Solution {
    public long distinctNames(String[] ideas) {
        int len = ideas.length;
        HashSet<String> dict[] = new HashSet[26];
        
        for(int i = 0; i< 26; i++){
            dict[i] = new HashSet<>();
        }
        
        for(int i = 0; i < len; i++){
            dict[ideas[i].charAt(0) - 'a'].add(ideas[i].substring(1));
        }
        
        long answer = 0;
        for(int i = 0; i < 25; ++i){
            for(int j = i + 1; j<26; ++j){
                long numOfmutual = 0;
                for(String ideaA : dict[i]){
                    if(dict[j].contains(ideaA)){
                        numOfmutual++;
                    }
                }
                
                answer += 2 * (dict[i].size() - numOfmutual) * (dict[j].size() - numOfmutual);
            }
        }
        
        return answer;
    }
}