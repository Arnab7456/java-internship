import java.util.Arrays;

public class IN_place {
    public static void main(String[] args) {
        int [] arr = {5,4,3,2,1};
         mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    static void mergeSort(int[] arr, int start, int end) {
        if (end - start == 1) {
            return;
        }
        int mid = (start + end) / 2;
        // here we pass copy of original arrays from 0 to mid
        mergeSort(arr, start, mid);
        mergeSort(arr, mid, end);

        mergeInplace(arr, start, mid, end);
    }

    private static void mergeInplace(int[] arr, int start, int mid, int end) {
        int[] mix = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;
        while (i < mid && j < end) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the array is not complete
        while (i < mid) {
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < end) {
            mix[k] = arr[j];
            j++;
            k++;
        }


        for (int l = 0; l < mix.length; l++) {
            arr[start + l] = mix[l];

        }

    }

    }


