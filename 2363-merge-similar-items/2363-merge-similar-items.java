class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        
       TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int[] item : items1) {
            int value = item[0];
            int weight = item[1];

            map.put(value, map.getOrDefault(value, 0) + weight);
        }

       
        for (int[] item : items2) {
            int value = item[0];
            int weight = item[1];

            map.put(value, map.getOrDefault(value, 0) + weight);
        }

     
        List<List<Integer>> ans = new ArrayList<>();

        for (int key : map.keySet()) {
            ans.add(Arrays.asList(key, map.get(key)));
        }

        return ans;
    }
}