class Solution {
    public int kthFactor(int n, int k) {
        int ans[]=new int [n];
        int m=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
 ans[m++]=i;

            }
        }
              if (m < k) {
            return -1;
        }
            return ans[k-1];
        
     
    }
}