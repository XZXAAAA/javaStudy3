import java.util.Scanner;

public class 手机号屏蔽 {
    public static void main(String[] args) {
        String phone = "13812345678";
        Scanner input = new Scanner(System.in);;
        System.out.println("请输入需要屏蔽的开始位数（包括）");
        int start = input.nextInt();
        System.out.println("请输入需要屏蔽的结束位数（包括）");
        int end = input.nextInt();
        String asterisk = "";
        for(int i=1;i<end-start+1;i++){
            asterisk += "*";
        }
        String result = phone.substring(0,start).concat(asterisk).concat(phone.substring(end-1));
        System.out.println(result);
    }
}
