class Solution {
    boolean arraySortedOrNot(int[] arr, int n) {
        if(n == 0 || n == 1) return true;
        if(arr[n-1]<arr[n-2]) return false;
        return arraySortedOrNot(arr, n-1);
    }
}
