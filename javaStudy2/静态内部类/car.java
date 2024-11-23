package 静态内部类;

public class car {
    private String name;
    private int price;

    static class Engine{
        private String name = "RR";
        private String color = "yellow";
        private static int price = 114514;

        public String getColor()
        {
            return color;
        }
        public String getName()
        {
            return name;
        }
        public static int getPrice()
        {
            return price;
        }
        public void setColor(String color)
        {
            this.color = color;
        }
        public void setName(String name)
        {
            this.name = name;
        }
    }
}
