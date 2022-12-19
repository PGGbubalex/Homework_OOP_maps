import java.util.Objects;

public class Person {

    private String nameAndSurname;

    private String number;

    public Person(String nameAndSurname, String number) {
        this.nameAndSurname = nameAndSurname;
        this.number = number;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public void setNameAndSurname(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(nameAndSurname, person.nameAndSurname) && Objects.equals(number, person.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAndSurname, number);
    }

    @Override
    public String toString() {
        return "Контанкт: " + getNameAndSurname() + ", номер: " + getNumber();
    }
}
