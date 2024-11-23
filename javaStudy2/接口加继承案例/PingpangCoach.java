package 接口加继承案例;

public class PingpangCoach extends Person implements sayEnglish,playSports{

    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void play() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void say() {
        System.out.println("乒乓球教练说英语");
    }
}
