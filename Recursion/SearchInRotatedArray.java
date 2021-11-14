class Solution
{
    int search(int A[], int l, int h, int key)
    {
        if(l<=h){
            int mid = (l+h)/2;
            if(key == A[mid]){
                return mid;
            }
            if(A[l]<A[mid]){
                if(key<A[mid]&&key>=A[l]){
                    return search(A,l,mid-1,key);
                }
                else{
                    return search(A,mid+1,h,key);
                }
            }
            
            else{
                if(key>A[mid]&&key<=A[h]){
                    return search(A,mid+1,h,key);
                }
                else{
                    return search(A,l,mid-1,key);
                }
            }    
        
        }
        return -1;
    }
}
