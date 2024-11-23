package Date学习;

import java.text.ParseException;
import java.util.Date;

public class SimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        String birthday = "2000-11-11";
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse(birthday);
        System.out.println(date);

    }
}
