package main.java.by.itstep.boris;

import static java.lang.System.*;

public class Strings {
    private static char[] original;

    public static void main(String[] args) {
//        String strOne="First String sjsdhjvshdgvhvsdhgvdshgsdhgsvuys";
//        System.out.println(strOne);
//        System.out.println(strOne.length());
//        char [] charArray = strOne.toCharArray();
//        for (char chr : charArray) {
//            System.out.print(chr + " ");
//        }
//        System.out.println();
//        String str = "";
//        System.out.println(str.length();
           String str = "java";
           StringBuilder stringBuilder = new StringBuilder(str);

           System.out.println(stringBuilder.capacity());
           stringBuilder.ensureCapacity(32);
           System.out.println(stringBuilder.capacity());
           System.out.println(stringBuilder.toString());
           stringBuilder.setCharAt(3,'g');
           stringBuilder.append(6);
           System.out.println(stringBuilder);
           String str2 = stringBuilder.toString();
           stringBuilder.delete(3,5);
           System.out.println(stringBuilder);
    }

}
