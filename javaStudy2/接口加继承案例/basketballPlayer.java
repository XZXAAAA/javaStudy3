package 接口加继承案例;

public class basketballPlayer extends Person implements playSports{

    public basketballPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("学打篮球");
    }
}
