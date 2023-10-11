package com.Arnab.Strings;

public class Strings {
    public static void main(String[] args) {
        skip("" , "baccadah");
        System.out.println(skipReturn("baccadbah") );
        System.out.println(skipString("baghapplems"));
        System.out.println(skipNotString("dhhalicationems"));

    }
    static void skip(String process , String unp){
        // base condition of recursion call
            if (unp.isEmpty()){
                System.out.println(process);
                return;
            }
            char ch = unp.charAt(0);
            if (ch == 'a'){
                skip(process,unp.substring(1));
            }else {
                skip(process+ch,unp.substring(1));

            }
    }

    static String skipReturn(String unp){
        if (unp.isEmpty()){
            return "";
        }
        char ch = unp.charAt(0);
        if (ch == 'a'){
            return skipReturn(unp.substring(1));
           }else {
            return ch +skipReturn(unp.substring(1));

        }
    }

    static String skipString(String unp){
        if (unp.isEmpty()){
            return "";
        }
        if (unp.startsWith("apple")){
            return skipString(unp.substring(5));
        }else {
            return unp.charAt(0) + skipString(unp.substring(1));

        }
    }
    static String skipNotString(String unp){
        if (unp.isEmpty()){
            return "";
        }
        if (unp.startsWith("apple") && ! unp.startsWith("apple")){
            return skipNotString(unp.substring(3));
        }else {
            return unp.charAt(0) + skipNotString(unp.substring(1));

        }
    }


}
