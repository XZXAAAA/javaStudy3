import java.util.StringJoiner;

public class 拼接字符串 {
    public static void main(String[] args) {
        StringJoiner sj = new StringJoiner("," , "[" , "]");
        char[] myChar = {'a','b','c'};
        for (int i = 0; i < myChar.length; i++) {
            sj.add(String.valueOf(myChar[i]));
        }
        System.out.println(sj);
    }
}
