public class Reverse_String {

    public static void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }
 public static char[] reverse(char[] s , int start , int end){
        if(start>end){
            return s;
        }
        char temp = s[start];
        s[start] = s[end];
        s[end]= temp;

        return  reverse(s, start+1 , end-1);
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        System.out.println(s);

    }
}
