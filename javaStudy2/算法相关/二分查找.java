package 算法相关;

import java.util.List;

public class 二分查找 {
    public static void main(String[] args) {
        int num = 25;
        int[] numList = new int[]{1, 20, 22, 23, 25, 54, 67, 89, 100};

        findNum(num, numList);

    }


    public static void findNum(int targetNum, int[] list) {
        int beginIndex = 0;
        int endIndex = list.length - 1;
        int midIndex = (beginIndex + endIndex) / 2;
        int midNum = list[midIndex];
        while (midNum != targetNum) {
            if (midNum > targetNum) {
                endIndex = midIndex - 1;
            } else {
                beginIndex = midIndex + 1;
            }
            midIndex = (beginIndex + endIndex) / 2;
            midNum = list[midIndex];
        }
        System.out.println(midIndex);

    }


}
