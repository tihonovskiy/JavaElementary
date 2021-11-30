package HW12.Coffee.Order;

import java.util.LinkedList;

public class CoffeeOrderBoard {
    private LinkedList<Order> orders = new LinkedList<>();

    public void add(String name) {
        orders.addLast(new Order(orders.size() + 1, name));
    }

    public Order deliver() {
        Order order = orders.getFirst();
        orders.removeFirst();
        return order;
    }

    public Order deliver(int orderNum) {
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getNum() == orderNum) {
                orders.addFirst(orders.get(i));
                orders.remove(i+1);
                this.deliver();
            }
        }
        return null;
    }

    public void draw() {
        System.out.println("===================================");
        System.out.println("Num\t\t\t|\tName");
        for (Order orders : orders) {
            System.out.print(orders.getNum());
            System.out.print("\t\t\t|\t");
            System.out.println(orders.getName());
        }
    }

    @Override
    public String toString() {
        return "CoffeeOrderBoard{" +
                "orders=" + orders +
                '}';
    }
}
