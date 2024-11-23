package 多态学习;

public class Animal {
    private int age;
    private String color;

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void eat(String something) {

    }
}

class Dog extends Animal {

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("狗吃" + something);
    }

    public void lookHome() {
        System.out.println("狗看家");
    }
}

class Cat extends Animal {

    public Cat(int age, String color) {
        super(age, color);
    }

    @Override
    public void eat(String something) {
        System.out.println("猫吃" + something);
    }

    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}