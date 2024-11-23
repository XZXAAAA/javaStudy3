package math学习;

public class 判断是否为质数 {
    public static void main(String[] args) {
        isPrime(11);
        isPrime(12);

    }

    public static void isPrime(int number){
        if(number < 2){
            System.out.println("这个数字不是质数");
        }
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                System.out.println("这个数字不是质数");
                return;
            }
        }
        System.out.println("这个数字是质数");

    }
}
