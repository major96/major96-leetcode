class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i = 0; i < words.length - 1; i++) {
            boolean rs = verify(words[i], words[i+1], order);
            if(!rs){
                return false;
            }
        }
        
        return true;
    }
    
    public boolean verify(String str1, String str2, String order){
        for(int i = 0; i < 20; i++){
            try {
                if(order.indexOf(str1.charAt(i)) == order.indexOf(str2.charAt(i))){
                    continue;
                }
            boolean rs = order.indexOf(str1.charAt(i)) < order.indexOf(str2.charAt(i));
                return rs;
            } catch(StringIndexOutOfBoundsException e){
                if(str1.length() <= str2.length()){
                    return true;
                }
                return false;
            }
             
        }
        return true;
    }
    
}