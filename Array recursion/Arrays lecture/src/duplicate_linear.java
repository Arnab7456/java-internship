import java.util.ArrayList;

public class duplicate_linear {
    public static void main(String[] args) {
        int [] arr = {1 , 4 , 5 , 7 , 7 , 18};
        findIndex(arr,7,0);
        System.out.println(list);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findIndex(int [] arr , int target , int index) {
        if (index == arr.length) {
            return ;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findIndex(arr, target, index + 1);
    }
}
