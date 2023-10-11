import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
        int[] arr1 = {15, 25 , 38 , 10 , 5 , 78 , 95};

        SelectionSort(arr1,arr1.length,0,0);
        System.out.println(Arrays.toString(arr1));

    }

    static void bubbleSort(int[] arr, int row, int coloum) {
        if (row == 0) {
            return;
        }
        if (coloum < row) {
            if (arr[coloum] > arr[coloum + 1]) {
                // swap
                int temp = arr[coloum];
                arr[coloum] = arr[coloum + 1];
                arr[coloum + 1] = temp;
            }
            bubbleSort(arr, row, coloum + 1);
        } else {
            bubbleSort(arr, row - 1, 0);
        }
    }
        static void SelectionSort ( int[] arr, int row, int coloum , int max){
            if (row == 0) {
                return;
            }
            if (coloum < row) {
                if (arr[coloum] > arr[max]) {
                    SelectionSort(arr ,row , coloum+1 , coloum);
                }else {
                    SelectionSort(arr,row,coloum+1 , max) ;
                }

            } else {
                // swap
                int temp =arr[max];
                arr[max] = arr[row-1] ;
                arr[row-1]=temp;
                SelectionSort(arr,row-1,0,0);
            }

        }
    }

