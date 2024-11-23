package 接口加继承案例;

public class basketballCoach extends Person implements playSports{

    public basketballCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("教打篮球");
    }

}
