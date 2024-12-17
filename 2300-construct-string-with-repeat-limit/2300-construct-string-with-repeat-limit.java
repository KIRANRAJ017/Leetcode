class Solution {
    public String repeatLimitedString(String s, int k) {
        PriorityQueue<Character> pq = new PriorityQueue<>((a, b)->b-a);
        StringBuilder res = new StringBuilder();
        Stack<Character> stk = new Stack<>();
        for(char i:s.toCharArray()) pq.add(i);
        char prev=pq.peek();
        int cnt=0;
        while(!pq.isEmpty()){
            char c=pq.poll();
            if(c==prev){
                if(cnt<k){
                    res.append(c);
                    cnt++;
                }
                else{
                    stk.push(c);   
                }
            }
            else{
                if(!stk.isEmpty()){
                    res.append(c);
                    cnt=0;
                    while(cnt<k && !stk.isEmpty()){
                        res.append(stk.pop());
                        cnt++;
                    }
                }
                else{
                    cnt=0;
                    res.append(c);
                    prev=c;
                    cnt++;
                }
            }
        }
        return res.toString();
    }
}