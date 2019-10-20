public class MaxSumBruteForce {
    public static void main(String args[]) {
        int arr[] = { 100, 200, 300, 400 }; 
        int k = 5; 
        int n = arr.length; 
        System.out.println(maxSum(arr, n, k)); 
    }
    
    static int maxSum(int[] arr, int n, int k){
        int index = 0;
        int maxSum = 0;
        for (int i = 0 ; i < n-k+1 ; i++) {
            int currSum = 0;
            for (int j = i ; j < i+k ; j++) {
                System.out.print(arr[j] + " ");
                currSum += arr[j];
            }
            System.out.println();
            System.out.println(currSum + " " + maxSum);
            maxSum = Math.max(currSum, maxSum);
        }
        
        return maxSum;
    }
}