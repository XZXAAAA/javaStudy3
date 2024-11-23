package arrayStudy;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
    //这个类是一个泛型类，所以可以指定数据类型
    //泛型类可以指定数据类型，也可以不指定，不指定的话，默认为Object类型
        System.out.println(list);
    //这个类在底层做了一些优化，底层是一个数组，所以可以调用数组的方法


    }


}
