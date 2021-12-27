package HW20;

public class CalculatorTestClass {
    double a;
    double b;

    public CalculatorTestClass() {
    }

    @BeforeSuite
    public void startMessage() {
        this.a = 10;
        this.b = 5;
        System.out.println("Calculation start");
    }

    @Test(priority = 1)
    public void addition() {
        System.out.println(a + b);
    }

    @Test(priority = 2)
    public void subtraction() {
        System.out.println(a - b);
    }

    @Test(priority = 5)
    public void multiplication() {
        System.out.println(a * b);
    }

    @Test(priority = 2)
    public void division() {
        System.out.println(a / b);
    }

    @AfterSuite
    public void endMessage() {
        System.out.println("End of computation");
    }
}
