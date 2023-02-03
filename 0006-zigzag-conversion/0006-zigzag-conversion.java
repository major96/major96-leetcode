class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        
        String result = "";
        for(int i = 0; i < numRows; i++){
            int term = 2*numRows - 2;
            int p = (term - 2 * i == 0) ? term : term - (term - 2 * i);
            for(int j = i; j < s.length(); j = j + p){
                result += s.charAt(j);
                if(p != term){
                    p = term - p;
                }
            }
            
        }
        
        return result;
        
    }
}
