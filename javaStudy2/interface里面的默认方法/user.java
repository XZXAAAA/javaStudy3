package interface里面的默认方法;

public class user implements Person{
    @Override
    public void say() {
        Person.super.say();
    }
}
