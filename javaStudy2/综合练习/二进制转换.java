package 综合练习;

public class 二进制转换 {
    public static void main(String[] args) {
        alterToBinary(9);
    }

    public static void alterToBinary(int num) {
        int left;
        int beginNum = num;
        String finalNum = "";
        while (num != 0) {
            left = num % 2;
            finalNum = left + finalNum;
            num = num / 2;
        }
        System.out.println(beginNum + " 转化后结果是：" + finalNum);


    }

}
