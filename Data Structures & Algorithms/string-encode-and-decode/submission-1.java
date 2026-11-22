class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String s:strs){
            sb.append(s.length());
            sb.append("#");
            for(int i=0;i<s.length();i++){
                sb.append(s.charAt(i));
            }
            
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res=new ArrayList<>();
        int i=0;
        
        while(i<str.length()){
            int length=0;
            while(str.charAt(i)!='#'){
                 length=length*10+(str.charAt(i)-'0');
                 i++;
            }
            i++;
            String word=str.substring(i,i+length);
            res.add(word);
            i+=length;
        }
        return res;
    }
}
