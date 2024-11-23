package 内部类;

public class 内部类练习1 {
    private int a = 10;

    class Inner {

        private int a = 20;

        public void show() {
            int a = 30;
            System.out.println(a);
        }

        public int getA() {
            return a;
        }
    }

    public int getA() {
        return a;
    }
}


