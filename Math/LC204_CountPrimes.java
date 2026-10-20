class Solution {
    public int countPrimes(int n) {
        int arr[]=new int[n];
        for(int i=2;i*i<n;i++){
            if(arr[i]==0){
                for(int j=i*i;j<n;j+=i){
                    arr[j]=1;
                }
            }
        }
        int count=0;
        for(int i=2;i<arr.length;i++){
            if(arr[i]==0){
                count++;
            }
        }
        return count;
    }
}