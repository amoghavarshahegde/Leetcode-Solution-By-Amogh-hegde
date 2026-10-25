class Solution {
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue <Integer> am= new PriorityQueue<>();
        for(int num:nums){
            am.offer(num);
        }
        while(k>0){
            int x=am.poll();
            am.offer(x+1);
            k--;
        }
        long product=1;
        while(!am.isEmpty()){
            product=(product*am.poll())%1000000007;
        }
        return (int)product;
        
    }
}