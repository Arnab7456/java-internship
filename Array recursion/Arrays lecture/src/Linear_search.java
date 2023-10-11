public class Linear_search {
    public static void main(String[] args) {
        int [] arr = {1 , 45 , 48 , 16 , 17};
        System.out.println(find(arr,45,0));
        System.out.println(findIndex(arr,45,0));
        System.out.println(findlast(arr,48,0));
    }
    static boolean find(int [] arr , int target, int index){
        // condition is used , if we don't find any ans , reach end of arrays
        if (index ==arr.length ){
            return false;
        }
         return arr[index] == target || find(arr , target , index+1);
    }
    // use for find index
    static int findIndex(int [] arr , int target , int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

        static int findlast(int [] arr , int target , int index){
            if (index == arr.length){
                return -1;
            }
            if (arr[index] == target){
                return index;
            }
            else {
                return findIndex(arr , target , index-1);
            }
    }
}
