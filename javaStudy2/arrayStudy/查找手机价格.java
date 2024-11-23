package arrayStudy;

import java.util.ArrayList;

public class 查找手机价格 {
    public static void main(String[] args) {
        Phone p1=new Phone("小米", 1999);
        Phone p2=new Phone("华为", 3999);
        Phone p3=new Phone("苹果", 9999);
        ArrayList<Phone> list=new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        findPhone(list, 5000);

        //按住alt不松可以竖向选择
    }
    public static void findPhone(ArrayList<Phone> list,int price){
        for (int i = 0; i < list.size(); i++){
            if(list.get(i).getPrice()<price){
                System.out.println("价格低的手机名字是");
                System.out.println(list.get(i).getName());
            }
        }

    }


}

class Phone{
    public String name;
    public double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Phone(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
