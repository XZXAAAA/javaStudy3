package interface里面的默认方法;

public interface Person {
    default void say(){
        System.out.println("我是一个人");
    }
    //默认方法 可以重写
    //它不是抽象方法，也不是静态方法
    //如果被重写，重写的时候去掉default
}
