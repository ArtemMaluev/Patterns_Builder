package maluevArtem;

public interface IPersonBuilder {

    Person build();

    PersonBuilder setName(String name);

    PersonBuilder setSurname(String surname);

    PersonBuilder setAge(int age);

    PersonBuilder setCity(String city);
}
