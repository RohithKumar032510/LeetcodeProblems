class Solution {
    static Map<String, Integer>values=new HashMap<>();
    static{
        values.put("M", 1000);
        values.put("D", 500);
        values.put("C", 100);
        values.put("L", 50);
        values.put("X", 10);
        values.put("V", 5);
        values.put("I", 1);
    }
    public int romanToInt(String s) {
        int sum=0;
        int i=0;
        while(i<s.length()) {
            String currentSymbol=s.substring(i,i+1);
            int curr=values.get(currentSymbol);
            int next=0;
            if (i+1<s.length()){
                String nextSymbol=s.substring(i+1,i+2);
                next=values.get(nextSymbol);
            }
            if(curr<next){
                sum+=(next-curr);
                i+=2;
            }
            else{
                sum+=curr;
                i+=1;
            }
        }
        return sum;
    }
}
