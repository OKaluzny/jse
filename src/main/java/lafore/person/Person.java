package lafore.person;

class Person {

    private String lastName;
    private String firstName;
    private int age;

    Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    void displayPerson() {
        System.out.print(" Last name: " + lastName);
        System.out.print(", First name: " + firstName);
        System.out.println(", Age: " + age);
    }

    String getLast() // Получение фамилии
    {
        return lastName;
    }
}
