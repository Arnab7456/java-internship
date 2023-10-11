package com.Arnab.Strings;

import java.util.ArrayList;

public class Sub_sequence {
    public static void main(String[] args) {
         subseq("" , "abc");
        System.out.println(  subseqReturn("" , "BKCD"));
        subseqAscii("" , "abc");
        System.out.println(subseqAsciiReturn("" , "abc"));

    }
    static void subseq(String pro , String unpro){
        // base condition
            if (unpro.isEmpty()){
                System.out.println(pro);
                return;
            }
            char ch = unpro.charAt(0);
            subseq(pro+ch , unpro.substring(1));
             subseq(pro , unpro.substring(1));

    }

    static ArrayList<String> subseqReturn(String pro , String unpro){
        // base condition
        if (unpro.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        char ch = unpro.charAt(0);

         ArrayList<String> left =subseqReturn(pro+ch , unpro.substring(1));
        ArrayList<String> right = subseqReturn(pro , unpro.substring(1));

        left.addAll(right);
        return left;
    }
    static void subseqAscii(String pro , String unpro){
        // base condition
        if (unpro.isEmpty()){
            System.out.println(pro);
            return;
        }
        char ch = unpro.charAt(0);
        subseqAscii(pro+ch , unpro.substring(1));
        subseqAscii(pro , unpro.substring(1));
        subseqAscii(pro+(ch+0) , unpro.substring(1));

    }

    static ArrayList<String> subseqAsciiReturn(String pro , String unpro){
        // base condition
        if (unpro.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        char ch = unpro.charAt(0);

        ArrayList<String> first =subseqAsciiReturn(pro+ch , unpro.substring(1));
        ArrayList<String> seconed = subseqAsciiReturn(pro , unpro.substring(1));
        ArrayList<String> third = subseqAsciiReturn(pro+(ch+0) , unpro.substring(1));

        first.addAll(seconed);
        first.addAll(third);
        return first;
    }
}
