package Btree.arnab;

import java.util.Scanner;

public class january {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        while (a-->0){
            int x1 = in.nextInt();
            int y1=in.nextInt();
            int x2=in.nextInt();
            int y2=in.nextInt();

            int res1 = ((x1*x1)+(y1*y1));
            int res2 = ((x2*x2)+(y2*y2));
            if (res1>res2){
                System.out.println("alex");
            }else if (res1<res2){
                System.out.println("bob");
            }else {
                System.out.println("equal");
            }

        }
        in.close();
    }
}
