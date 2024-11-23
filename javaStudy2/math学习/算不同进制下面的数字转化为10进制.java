package math学习;

public class 算不同进制下面的数字转化为10进制 {
    public static void main(String[] args) {
        calcuateNum(3, 10222222);
    }

    //这里可以提前判断以下输入的数字是否不符合该进制下面数字的规范
    public static void calcuateNum(int unit, int number) {
        long begin = System.currentTimeMillis();
        String num = String.valueOf(number);
        for (int i = 0; i < num.length(); i++){
            if (Integer.parseInt(num.substring(i,i+1)) >= unit){
                System.out.println("输入的数字不符合当前进制下面的数字标准");
                long end = System.currentTimeMillis();
                System.out.println("运行时间："+(end-begin)+"ms");
                return;
                //使用return可以直接退出方法体，从而不用判断下面的实际大小
            }
        }


        int temp;
        int tempPos = 0;
        double result = 0;
        while(number != 0){
            temp = number % 10;
            result += (temp * Math.pow(unit,tempPos));
            number /= 10;
            tempPos++;
        }
        long end = System.currentTimeMillis();
        System.out.println("结果是"+result);
        System.out.println("运行时间："+(end-begin)+"ms");
    }
}
