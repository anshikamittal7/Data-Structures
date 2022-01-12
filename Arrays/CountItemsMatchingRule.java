class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0,find=2;
        if(ruleKey.equals("type")) {
            find = 0;
        }
        else if(ruleKey.equals("color")){
            find = 1;
        }
        
        for(int i=0;i<items.size();i++){
            if(items.get(i).get(find).equals(ruleValue)){
                count++;
            }
        }
        return count;
    }
}