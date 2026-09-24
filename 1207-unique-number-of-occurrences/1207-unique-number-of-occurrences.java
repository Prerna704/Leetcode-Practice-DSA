class Solution {
    public boolean uniqueOccurrences(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num,map.getOrDefault(num,0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        for(int x : map.values()){
            if(set.contains(x)){
                return false;
            }
            set.add(x);
        }
        return true;

    }
}