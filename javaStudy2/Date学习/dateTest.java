package Date学习;

import java.util.Date;
//记得导入date包时，记得选择util包名下面的包

public class dateTest {
    public static void main(String[] args) {
        Date myDate = new Date();
        //时间原点表示的是1970年1月1日，单位是格林威治时间
        //阮如果要访问时间原点，则需要在Date里面加入0
        Date originTime = new Date(0);
        System.out.println(originTime);

        long time = myDate.getTime();
        //getTime 方法表示的是获取距离时间原点的毫秒数

        int n = 10000;
        while( n > 0){
            System.out.println("测试运行的时间");
            n--;
        }

        Date myDate2 = new Date();
        long time2 = myDate2.getTime();
        System.out.println("运行中间程序花费的时间  "+(time2 - time)+"毫秒");

        //注意，通过一个date对象获得的毫秒值是一样的，不管获得的long处在的位置





    }
}
