public class aleternateMerge{
    public static void main(String[] args) {
        String s1="abc";
        String s2="def";
        Merger m=new Merger();
        System.out.println(m.mergeAlternately(s1,s2));
    }
}
class Merger{
    String mergeAlternately(String word1, String word2){
        StringBuilder res= new StringBuilder();
        int max_len=Math.max(word1.length(),word2.length());
        for(int i=0;i<max_len;i++){
            if(i<word1.length()){
                res=res.append(word1.charAt(i));
            }
            if(i<word2.length()){
                res=res.append(word2.charAt(i));
            }
        }
        return res.toString();
    }
}
