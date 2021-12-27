package HW20;

public class WorldsTestClass {
    String string;

    public WorldsTestClass() {
    }

    @BeforeSuite
    public void getWelcomeMessage() {
        this.string = "My default string";
        System.out.println("Welcome");
    }

    @Test(priority = 5)
    public void getLetter() {
        System.out.println(string.substring(0,1));
    }

    @Test(priority = 2)
    public void getWords() {
        System.out.println(string.split(" ")[0]);
    }

    @Test(priority = 3)
    public void getSentence() {
        System.out.println(string);
    }

    @AfterSuite
    public void getEndMessage() {
        System.out.println("The END!");
    }
}
