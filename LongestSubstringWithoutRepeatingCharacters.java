class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        int max=Integer.MIN_VALUE;
        Set<Character> hset=new HashSet<>();
        int m=0;
        for(int i=0;i<s.length();i++){
           if(hset.contains(s.charAt(i))){
            while(m<i&&hset.contains(s.charAt(i))){
            hset.remove(s.charAt(m));
            m++;
           } 
           }
           hset.add(s.charAt(i));
           max=Math.max(max,i-m+1);
        }
        return max;
    }
}
