package HW3;

public class Main {
    public static void main(String[] args) {
        Person emptyPerson = new Person();
        Person fullNameOneString = new Person("Иванов Иван Иванович");
        Person fullName = new Person("Кирилл", "Тихоновский", "Андреевич");

        System.out.println(emptyPerson);
        System.out.println(fullNameOneString);
        System.out.println(fullName);
    }
}
