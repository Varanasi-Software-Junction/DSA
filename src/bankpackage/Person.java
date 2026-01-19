package bankpackage;

public class Person {

    private String name, address;
    private Mobile phone;
    private int age;

    public Person(String name, String address, Mobile phone, int age) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", phone=" + phone + ", age=" + age + '}';
    }

}
