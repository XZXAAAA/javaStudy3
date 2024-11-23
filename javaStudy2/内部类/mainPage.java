package 内部类;

public class mainPage {
    public static void main(String[] args) {
        car.Engine engine = new car().new Engine();
        engine.setName("appleEngine");
        engine.setColor("black");
        System.out.println(engine.getPrice()+" "+engine.getColor());
    }
}
