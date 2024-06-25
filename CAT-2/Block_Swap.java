import java.util.Scanner;

class GFG {
    static void leftRotate(int arr[], int d, int n) 
    {
        int i, j;
        if (d == 0 || d == n)
            return;
        if (d > n)
            d = d % n;
        i = d;
        j = n - d;
        while (i != j) {
            if (i < j) {
                swap(arr, d - i, d + j - i, i);
                j -= i;
            } else {
                swap(arr, d - i, d, j);
                i -= j;
            }
        }
        swap(arr, d - i, d, i);
    }

    public static void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void swap(int arr[], int fi, int si,
            int d) {
        int i, temp;
        for (i = 0; i < d; i++) {
            temp = arr[fi + i];
            arr[fi + i] = arr[si + i];
            arr[si + i] = temp;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[10];
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        leftRotate(arr, d, n);
        printArray(arr, n);
        sc.close();
    }
}
