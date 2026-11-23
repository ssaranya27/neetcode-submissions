class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] prefix=new int[nums.length];
        int[] postfix=new int[nums.length];
        int[] res=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i];

        }
        postfix[n-1]=nums[n-1];
        for(int j=n-2;j>=0;j--){
            postfix[j]=postfix[j+1]*nums[j];
        }
         res[0]=postfix[1];
         res[n-1]=prefix[n-2];
        for(int i=1;i<n-1;i++){
            res[i]=prefix[i-1]*postfix[i+1];
        }
    return res;
    }
}  
