package 综合练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 计算活了多少天 {
    public static void main(String[] args) throws ParseException {
        String birthday = "2003-04-22";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDate = sdf.parse(birthday);
        Date today = new Date();
        long diff = today.getTime() - birthDate.getTime();
        System.out.println("你现在已经活了  "+ diff/1000/60/60/24/365+" 年");
    }
}
