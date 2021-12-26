class Sol
{
    int countRev (String s)
    {
        Stack<Character> open = new Stack<>();
        int l=s.length();
        int count=0;
        if(l%2!=0){
            return -1;
        }
        for(int i=0;i<l;i++){
            if(s.charAt(i)=='{'){
                open.push('{');
            }
            else{
                if(open.isEmpty()){
                    count++;
                    open.push('{');
                }else{
                    open.pop();
                }
            }
        }
        return count+open.size()/2;
    }
}
