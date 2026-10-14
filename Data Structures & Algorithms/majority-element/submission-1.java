class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int freq:nums){
            map.put(freq,map.getOrDefault(freq,0)+1);
        }
        int largest=0;
        int freqL=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>freqL){
                freqL=entry.getValue();
                largest=entry.getKey();
            }
        }
        return largest;
    }
}