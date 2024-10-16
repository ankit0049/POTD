import java.util.*;

class Solution {
    public String longestDiverseString(int a, int b, int c) {
        Map<Character , Integer> map = new HashMap();

        if(a > 0) map.put('a' , a); 
        if(b > 0) map.put('b' , b);
        if(c > 0) map.put('c' , c); 
         StringBuilder ans = new StringBuilder();
        PriorityQueue<Character> pq = new PriorityQueue((x , y)->(map.get(y) - map.get(x)));  
        pq.addAll(map.keySet());
        while( !pq.isEmpty())
        {
            char first = pq.poll(); 
            if(ans.length()>=2 && ans.charAt(ans.length()-1) == first && ans.charAt(ans.length()-2)== first)
            {
                if(pq.isEmpty()) break; 

                char second = pq.poll(); 
                ans.append(second); 
                map.put(second ,map.get(second)-1);
                if(map.get(second)>0)
                {
                  pq.offer(second);
                }
                pq.offer(first);
            } else 
            {
                ans.append(first);
                map.put(first , map.get(first)-1);
                if(map.get(first)>0)
                {
                    pq.offer(first);
                }
            }
        } 
        return ans.toString();
    }
}