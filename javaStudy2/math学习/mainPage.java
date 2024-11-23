package math学习;

public class mainPage {
    public static void main(String[] args) {
        System.out.println(Math.floor(2.6));
        System.out.println(Math.floor(2.3));
        //floor就是向下取整，相当于去除小数点后面的数字

        System.out.println(Math.ceil(2.5));
        System.out.println(Math.ceil(2.6));
        System.out.println(Math.ceil(2.3));
        //ceil就是向上取整，相当于返回大于并且最接近输入值的数字

        System.out.println(Math.pow(2,3));
        //Math.pow(a,b)代表着a的b次方
        //上面的式子代表着2的3次方
        System.out.println(Math.abs(-2.6));
        //上面这个数字代表着取数字的绝对值

        System.out.println(Math.random()*100+1);
        //上面的语句就是生成一个1-100的随机数


        System.out.println(Math.pow(2,32));
    }
}
