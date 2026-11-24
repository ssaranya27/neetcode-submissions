class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int num:nums){
            sum=sum+num;
            int required=sum-k;
            count+=map.getOrDefault(required,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}