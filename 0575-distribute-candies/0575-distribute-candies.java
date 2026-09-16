class Solution {
    public int distributeCandies(int[] candyType) {
      HashSet <Integer> set=new HashSet<>();
      for(int x:candyType){
        set.add(x);
      }
        return Math.min(set.size(),candyType.length/2);
      
    }
}