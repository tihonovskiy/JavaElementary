package HW12.Coffee.Order;

public class Main {

    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("first");
        coffeeOrderBoard.add("second");
        coffeeOrderBoard.add("third");
        coffeeOrderBoard.add("fourth");
        coffeeOrderBoard.add("fifth");

        System.out.println("All orders: ");
        System.out.println(coffeeOrderBoard);
        System.out.println("Return done order(first): ");
        System.out.println(coffeeOrderBoard.deliver());
        System.out.println("Check delete orders (first): ");
        System.out.println(coffeeOrderBoard);
        System.out.println("Return done order by num (fourth): ");
        System.out.println(coffeeOrderBoard.deliver(4));
        System.out.println("Check delete orders (fourth): ");
        System.out.println(coffeeOrderBoard);
        System.out.println();
        coffeeOrderBoard.draw();
    }
}
