package 内部类;

public class car {
    private String name;
    private String color;
    private int price;

    //内部类表示的事物是外部的一部分，单独出现没有意义
    class Engine{
        private String name;
        private String color;
        private int price;

        public String getName()
        {
            return name;
        }
        public String getColor()
        {
            return color;
        }
        public int getPrice()
        {
            return price;
        }
        public void setName(String name)
        {
            this.name = name;
        }
        public void setColor(String color)
        {
            this.color = color;
        }
        //内部类访问外部类的成员变量

    }
}
