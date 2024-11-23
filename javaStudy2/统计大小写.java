import java.util.Scanner;

public class 统计大小写 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.nextLine();
        int largeNum = 0;
        int smallNum = 0;
        for (int i = 0; i < s.length(); i++) {
            //这里通过比较字符的大小，也就是比较字符的ASCII码
            // 判断是否为小写字母 大写字母
            //大写A 对应 65  小写a 对应 97
            //数字1 对应 49 数字0 对应 48
            if (s.charAt(i)>='a' && s.charAt(i)<='z'){
                smallNum++;
            }else if (s.charAt(i)>='A' && s.charAt(i)<='Z'){
                largeNum++;
            }
        }
        System.out.println("大写字母有"+largeNum+"个，小写字母有"+smallNum+"个");
    }
}

