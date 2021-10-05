public static void merge(int arr[], int l, int mid, int r)
    {
        int i=l,j=mid+1,k=0;
        int ans[]=new int[r-l+1];
        while(i<=mid && j<=r){
            if(arr[i]<arr[j]){
                ans[k]=arr[i];i++;k++;
            }
            if(arr[i]>arr[j]){
                ans[k]=arr[j];j++;k++;
            }
        }
        while(i<=mid){
            ans[k]=arr[i];i++;k++;
        }
        
        while(j<=r){
            ans[k]=arr[j];j++;k++;
        }
        for(int p=l,m=0;p<=r;m++,p++){
            arr[p]=ans[m];
        }
    }
    public static void mergeSort(int arr[], int l, int r)
    {
        int mid=(l+r)/2;
        if(l<r){
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
        
    }
