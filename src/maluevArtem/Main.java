package maluevArtem;

public class Main {

    public static void main(String[] args) {

        Person anna = new PersonBuilder()
                .setName("Anna")
                .setSurname("Ivanova")
                .setAge(30)
                .setCity("Moscow")
                .build();

        Person oleg = anna.newChildBuilder()
                .setAge(10)
                .setName("Oleg")
                .build();

        System.out.println(oleg);
        System.out.println(anna);
    }
}
