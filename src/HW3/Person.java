package HW3;

/*
1) Создать класс Person у котороего есть 3 поля - фамилия, имя, отчество.
Создать 2 конструктора - одни на все поля, во второй задается строка типа "Иванов Иван Иванович",
он ее должен распарсить и задать значения полям.
*/

public class Person {
    private String name;
    private String lastName;
    private String patronymic;

    public Person() {

    }

    public Person(String name, String lastName, String patronymic) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public Person(String fullName) {
        String delimeter = " ";
        String[] subFullName = fullName.split(delimeter);

        name = subFullName[0];
        lastName = subFullName[1];
        patronymic = subFullName[2];
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}
