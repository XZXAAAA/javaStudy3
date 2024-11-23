package 多态学习;

public class TestPage {
    public static void main(String[] args) {
            Person p = new Person();
            p.setName("谢子潇");
            p.setAge(21);

            //多态的优势：方法中，使用父类型作为参数，可以接收所有子类对象
            //多态的弊端：不能调用子类特有的方法,必须要向下转型
            //详细可以见Person编写的关于instanceof 的判断
            Animal a = new Dog(2, "black");
            Animal b = new Cat(3, "white");


            //小技巧，按住ctrl+p 提示构造器参数的填写
            p.keepPet(a,"bone");
            p.keepPet(b,"fish");

    }

}
