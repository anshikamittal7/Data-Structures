import java.util.*;
public class Solution {

    public static Queue<Integer> reverseQueue(Queue<Integer> q) {
  
      if(q.size()<=1){
          return q;
      }
      int x = q.poll();
      q = reverseQueue(q);
      q.add(x);
      return q;
    }
  }
