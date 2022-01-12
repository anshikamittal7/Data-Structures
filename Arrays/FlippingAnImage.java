class Solution {
    public void swap(int arr[][],int i,int j,int k){
        int temp = arr[k][i];
        arr[k][i]=arr[k][j];
        arr[k][j]=temp;
    }
    
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                image[i][j]^=1;
            }
            for(int j=0;j<n/2;j++){
                swap(image,j,n-j-1,i);
            }
        }
        return image;
    }
}
