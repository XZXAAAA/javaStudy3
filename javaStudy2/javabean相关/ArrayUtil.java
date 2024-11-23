package javabean相关;

import java.util.StringJoiner;

public class ArrayUtil {
    private ArrayUtil(){

    }

    public static void getAverage(int ... nums){
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        System.out.println(sum/nums.length);
    }

    public static void printArr(int ... nums){
        StringJoiner sj = new StringJoiner(",","[", "]");
        for(int i : nums){
            sj.add(String.valueOf(i));
        }
        System.out.println(sj);
    }





}
