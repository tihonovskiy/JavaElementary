package HW12.Coffee.Order;

public class Order {
    private int num;
    private String name;

    public Order(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
