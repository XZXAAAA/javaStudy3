package Date学习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class 计算肯德基秒杀时间 {
    public static void main(String[] args) throws ParseException {
        String beginTime = "2023-11-11 00:00:00";
        String endTime = "2023-11-11 00:10:00";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = sdf1.parse(beginTime);
        Date date2 = sdf1.parse(endTime);
        System.out.println("该活动的持续时间是： " + (date2.getTime() - date1.getTime()) / 1000 + " 秒");
    }
}
