import org.junit.Test;

import java.util.Scanner;

public class 字符串相关 {
    public static void main(String[] args) {
        char[] chars = new char[]{'a', 'b', 'c', 'd', 'e'};
        chars[0] = 's';
        String s = new String(chars);
        System.out.println(s);
        //传递一个字符数组，然后进行拼接

        //在网络上传输的字节数组，需要转换为字符串
        byte[] bytes = new byte[]{97, 98, 99, 100, 101};
        String s1 = new String(bytes);
        System.out.println(s1);


        String stringDemo = "demo";
        //该创建方式相比直接new String("demo")，节省了内存

        test3();

        Scanner scanner = new Scanner(System.in);
        String s2 = scanner.next();

    }

    public static void test1(){
        String ss1 = "abc";
        String ss2 = "abc";
        System.out.println(ss1 == ss2);
        //因为ssr1和ss2是基本数据类型，所以比较的是值
    }

    public static void test2(){
        String ss1 = new String("abc");
        String ss2 = new String("abc");
        System.out.println(ss1 == ss2);
        //此时ss1和ss2都是引用数据类型，所以比较的是地址值

//        1. new String("Hello") 的创建过程
//        检查字符串常量池：
//        当执行 new String("Hello") 时，首先会检查字符串常量池中是否存在值为 "Hello" 的字符串。
//        如果存在，则不会在常量池中创建新的对象。
//        如果不存在，则会在常量池中创建一个新的字符串对象。
//        在堆内存中创建新的对象：
//        不管常量池中是否存在 "Hello"，new String("Hello") 都会在堆内存中创建一个新的 String 对象。
//        这个新的 String 对象的内容是常量池中 "Hello" 的副本。
//        创建的新对象的引用会被赋值给变量 str。
    }

    public static void test3(){
        String s = new String("HELLO");
        String s1 = new String("hello");
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        //比较字符串中的内容是否相等
    }

    //键盘录入得到的字符串是new出来的


}