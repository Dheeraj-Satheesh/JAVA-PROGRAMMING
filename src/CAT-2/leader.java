class EthCode 
{
    public static void leaderprint(int arr[], int n) 
    {
        int L = arr[n - 1];
        System.out.println(L + " is a leader");
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > L) {
                L = arr[i];
                System.out.println(L + " is a leader");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 7, 6, 4, 5, 0, 1 };
        int n = arr.length;
        leaderprint(arr, n);
    }
}