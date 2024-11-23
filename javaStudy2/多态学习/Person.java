package 多态学习;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a, String something) {
        if (a instanceof Dog d){
            System.out.println("年龄为" + this.age + "岁的" + this.name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的狗");
            System.out.print(a.getAge() + "岁的狗行为：");
            a.eat(something);
            d.lookHome();
        } else if (a instanceof Cat c) {
            System.out.println("年龄为" + this.age + "岁的" + this.name + "养了一只" + a.getColor() + "颜色的" + a.getAge() + "岁的猫");
            System.out.print(a.getAge() + "岁的猫行为：");
            a.eat(something);
            c.catchMouse();
        }



    }



}
