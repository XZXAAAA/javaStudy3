package 内部类;

public class 内部类练习1test {
    public static void main(String[] args) {
        内部类练习1 i = new 内部类练习1();
        System.out.println(i.getA());
        内部类练习1.Inner inner = i.new Inner();
        System.out.println(inner.getA());
        inner.show();

    }
}
