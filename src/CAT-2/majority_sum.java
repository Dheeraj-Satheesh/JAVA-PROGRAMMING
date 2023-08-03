import java.util.HashMap;
import java.util.Map;

class EthCod {
    public static int findMajorityElement(int arr[]) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            map.put(i, map.getOrDefault(i,0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) 
        {
            if (entry.getValue() > arr.length / 2) 
            {
                return entry.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 8, 7, 4, 1, 2, 2, 2, 2, 2, 2 };
        int result = findMajorityElement(arr);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("null");
        }
    }
}