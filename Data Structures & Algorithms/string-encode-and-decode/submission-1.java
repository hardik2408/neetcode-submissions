class Solution {

    public String encode(List<String> strs) {
        
        StringBuilder sb = new StringBuilder();
        for(String str:strs){
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String s) {
        
        List<String> ans = new ArrayList<>();

        for(int i=0;i<s.length();){

            int j = i;
            while(s.charAt(j) != '#')
            j++;

            int len = Integer.valueOf(s.substring(i,j));

            j++;
            i = j;

            for(int k=0;k<len;k++){
                j++;
            }

            ans.add(s.substring(i,j));

            i = j;
        }

        return ans;
    }
}
