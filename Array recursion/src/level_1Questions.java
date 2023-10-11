public class level_1Questions {
    public static void main(String[] args){
        System.out.println("normal printing");
    fun(5);
        System.out.println("reverse function");
    funrev(5);

        int ans = fact(5);
        System.out.println("factorial of a number : " + ans);
        int ans1 = sum(1342);
        System.out.println("sum of the digits : "+ans1);
        int ans2 = product(1342);
        System.out.println("production of digits is : " + ans2);

        System.out.println(count_zero(45065070));
    }
    // here we want to print 5-4-3-2-1
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    // here we want to print 1-2-3-4-5
    static void funrev(int n){
        if(n==0){
            return;
        }
        funrev(n-1);
        System.out.println(n);
    }
//    factorial number
    static  int fact(int n){
        if (n<=1){
            return 1;
        }
        return  n * fact(n-1);
    }

    static  int sum(int n){
        if (n==0){
            return 0;
        }
        return  (n%10) + sum(n/10);
    }
    static int product(int n){
        if (n%10 == n){
            return n;
        }
        return  (n%10) * product(n/10);

    }
    static int count_zero(int n){
        return count(n,0);
    }
    static int count(int digits , int count){
        if(digits ==0){
            return count;
        }
        int rem = digits %10;
        if (rem == 0){
            return count(digits/10 , count+1 );
        }
        return count(digits/10 , count);
    }
}