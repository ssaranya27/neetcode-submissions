class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ar1=s.toCharArray();
        char[] ar2=t.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        String s3=new String(ar1);
        String s4=new String(ar2);
        return s3.equals(s4);
    }
}
