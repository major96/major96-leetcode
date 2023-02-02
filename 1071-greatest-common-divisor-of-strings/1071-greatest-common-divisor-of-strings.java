class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String str = (str1.length() <= str2.length()) ? str1 : str2;
        int length = str.length();
		for(int i = length; i > 0; i--){
			String divisor = str.substring(length - i);
            String operand = (!str.equals(str1)) ? str1 : str2;
            if(Arrays.toString(operand.split(divisor)).equals("[]")){
               if (Arrays.toString(str.split(divisor)).equals("[]")) {
                     return divisor;
               }
            }
        }
        return "";
    }
}