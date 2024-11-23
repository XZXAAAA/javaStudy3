package 接口加继承案例;

public class PingpangPlayer extends Person implements sayEnglish,playSports{

    public PingpangPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("学打乒乓球");
    }

    @Override
    public void say() {
        System.out.println("乒乓球队员说英语");
    }
}
