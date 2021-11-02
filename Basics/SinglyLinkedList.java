import java.util.*;

class node{
    int data;
    node next;
    
    public node(int data){
        this.data=data;
    }
    
    //ADD NODE
    public void add(int x){
        node temp = this;
        while(temp.next != null){
            temp = temp.next;
        }
        node n2 = new node(x);
        temp.next = n2;
    }
    
    //INSERT NODE
    public node insert(int index, int x){
        node temp = this;
        if(index == 0){
            node n1 = new node(x);
            n1.next = temp;
            
            return n1;
        }
        
        else{
            for(int i=1; i<index && temp != null ; i++){
                temp = temp.next;
            }
            if(temp != null){
                node n1 = new node(x);
                n1.next = temp.next;
                temp.next = n1;
            }
            
        }
        return this;
    }
    
    //REMOVE NODE
    public node remove(int index){
        node temp = this;
        if(index == 0){
            return this.next;
        }
        else{
            while(index-- != 1 && temp!= null){
                temp = temp.next;
            }
            if(temp!= null) temp.next = temp.next.next;
            
        }
        return this;
    }
}
class gfg{
    static Scanner s = new Scanner(System.in);
    
    //PRINT LL
    public static void print(node n1){
        while(n1 != null){
            System.out.print(n1.data + " ");
            n1=n1.next;
        }
        System.out.println();
    }
    
    //INCREMENT IN DATA OF EACH NODE
    public static void increment(node n1){
        while(n1 != null){
            n1.data++;
            n1=n1.next;
        }
    }
    
    //LENGTH OF LL
    public static int length(node n1){
        int l=0;
        while(n1 != null){
            l++;
            n1=n1.next;
        }
        return l;
    }
    
    //GET NODE DATA
    public static int get(node n1,int i){
        while(i-- != 1){
            n1 = n1.next;
        }
        return n1.data;
    }
    
    //INPUT 
    public static node input(){
        Scanner s=new Scanner(System.in);
        node n1 = new node(s.nextInt());
        if(n1.data == -1){
            return null;
        }
        node temp = n1;
        while(s.hasNextInt() && n1.data != -1 ){
            int x = s.nextInt();
            if(x == -1) break;
            else{
                node n2 = new node(x);
                n1.next = n2;
                n1 = n1.next;
            }
        }
        return temp;
    }
    
    //SEARCH NODE
    public static int search(int x, node n1){
        int index = 0;
        while(n1 != null){
            if(n1.data == x){
                return index;
            }
            else{
                n1 = n1.next;
            }
            index++;
        }
        return -1;
    }
    
    //AppendLastNToFirst
    public static node append(node n1, int num){
        if(num == 0 || num == length(n1)){
            return n1;
        }
        
        node temp = n1;
        int l = length(n1) - num;
        while(l-- != 1){
            temp = temp.next;
        }
        node temp2 = temp.next;
        temp.next = null;
        node ans = temp2;
        
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        temp2.next = n1;
        return ans;
    }
    public static node uniqueSortedList(node head) {
        node temp = head;
        while(temp != null){
            int x = temp.data;
            while(temp.next != null && x == temp.next.data){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }
    
    //REVERSE AND PRINT LL
    public static void reverseLL(node n1){
        for(int j=0; j<length(n1) ;j++){
            node temp = n1;
            for(int i=1; i<length(n1)-j; i++){
                temp = temp.next;
            }
            System.out.print(temp.data+" ");
        }
        System.out.println();
    }
    public static void revLL(node n1){
        if(n1 == null) return ;
        revLL(n1.next);
        System.out.print(n1.data+" ");
    }
    
    //CHECK PALINDROME
    public static boolean palindrome(node head){
        node temp = head;
        int l=length(head);
        node t = head;
        for(int j=0; j<l/2 ;j++){
            node t2 = head;
            for(int i=1; i<l-j; i++){
                t2 = t2.next;
            }
            if(t.data != t2.data){
                return false;
            }
            t = t.next;
            
        }
        return true;   
    }
    
    //MAIN
    public static void main (String[] args) {
        
        node n1 = input();
        print(n1);
        
        n1 = append(n1, 1);
        print(n1);
    }
}
