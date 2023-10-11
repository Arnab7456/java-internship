import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("merge sort");
        int [] arr = {5,4,3,2,1};
//        arr = mergeSort(arr);
        // it's not modified the original array
//        int [] ans = mergeSort(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static int [] mergeSort(int [] arr){
        if (arr.length==1){
            return arr;
        }
        int mid = arr.length/2;
        // here we pass copy of original arrays from 0 to mid
        int [] left = mergeSort(Arrays.copyOfRange(arr , 0 , mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left , right);
    }
    private static int [] merge (int [] first , int [] seconed){
        int [] mix = new int [first.length + seconed.length];

        int i =0;
        int j = 0;
        int k = 0;

        while (i<first.length && j< seconed.length){
            if (first[i]< seconed[j]){
                mix[k] = first[i];
                i++;
            }else {
                mix[k] = seconed[j];
                j++;
            }
            k++;
        }
        // it may be possible that one of the array is not complete
        while (i<first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j<seconed.length){
            mix[k] = seconed[j];
            j++;
            k++;
        }
        return  mix;
    }
}