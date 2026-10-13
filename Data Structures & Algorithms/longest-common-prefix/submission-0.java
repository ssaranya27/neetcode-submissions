class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        StringBuilder res=new StringBuilder();
        int i=0,j=0;
        while(i<first.length() && j<last.length()){
            char c=first.charAt(i);
            if(first.charAt(i)!=last.charAt(j)){
                break;
            }
            res.append(first.charAt(i));
            i++;
            j++;
        }
        return res.toString();
    }
}