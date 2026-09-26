class Solution {
    public boolean isBalanced(String num) {
        char []ans=num.toCharArray();
        int a=0;
        int b=0;
        for(int i=0;i<ans.length;i+=2){
            a+=ans[i]-'0';
        }
           for(int i=1;i<ans.length;i+=2){
            b+=ans[i]-'0';
        }
     return a==b;
        
    }
}