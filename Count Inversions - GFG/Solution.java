import java.util.*;

public class Solution {

    public static void main(String[] args) {
                Scanner sc =new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0)
        {
            t--;
            int n = sc.nextInt();
            int[] intArray = new int[n];

            for(int x=0;x<n;x++)
            {
                intArray[x] = sc.nextInt();

            }


       long ans = mergeSort(intArray, 0, intArray.length);

       System.out.println(ans);
        }
    }
    
    public static long mergeSort(int[] input, int start, int end) {

        long inv_count = 0;

        if (end - start < 2) {
            return inv_count;
        }
        int mid = (start + end) / 2;
        inv_count = mergeSort(input, start, mid);
        inv_count += mergeSort(input, mid, end);
        inv_count += merge(input, start, mid, end);

        return inv_count;
    }
    public static long merge(int[] input, int start, int mid, int end) {

        long inv_count = 0;

        if (input[mid - 1] < input[mid]) {
            return inv_count;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while(i < mid && j < end) {

            if (input[i] <= input[j]) {
                temp[tempIndex++] = input[i++];
            }
            else {
                temp[tempIndex++] = input[j++];

                inv_count += mid - i;
            }
        }

        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);

        return inv_count;


    }
}
