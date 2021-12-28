import java.util.*;
public class Solution 
{
  public static Queue<Integer> reverseElements(Queue<Integer> q, int k) 
  {
      if(k>q.size()||q.size()<=1) return q;
      Stack<Integer> s = new Stack<>();
      int temp=k,size=q.size()-k;
      while(temp--!=0){
          s.push(q.poll());
      }
      while(!s.isEmpty()){
          q.add(s.pop());
      }
      while(size--!=0){
          q.add(q.poll());
      }
      return q;
    }
  }
