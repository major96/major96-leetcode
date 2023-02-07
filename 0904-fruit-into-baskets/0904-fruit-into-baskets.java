class Solution {
    public int totalFruit(int[] fruits) {
        if(fruits.length == 1){
            return 1;
        }
        int result = 0;
        int mark = 0;
        int cmp = 0;
        Map<Integer, Integer> basket = new HashMap<>();
        for(int i = 0; i < fruits.length; i++){
            basket.put(fruits[i], basket.getOrDefault(fruits[i], 0) + 1);   
            cmp++;
            if(basket.size() > 2){
                for(; mark < i; mark++){
                    basket.put(fruits[mark], basket.get(fruits[mark]) - 1);
                    if(basket.get(fruits[mark]) == 0){
                        basket.remove(fruits[mark]);
                    }
                    if(basket.size()<=2){
                        mark++; cmp--;
                        break;
                    }
                    cmp--;
                }
            }
            result = Math.max(result, cmp);
        }

        
        return result;
    }
}