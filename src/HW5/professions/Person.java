package HW5.professions;

public class Person extends Driver {
    private int age;
    private String citizenship;

    public Person(String fullName, int experience, int age, String citizenship) {
        super(fullName, experience);
        this.age = age;
        this.citizenship = citizenship;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", citizenship='" + citizenship + '\'' +
                '}';
    }
}
