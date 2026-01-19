package oops;

public class Person {

    private String name, address, mobileno;
    private int age;

    public Person(String name, String address, String mobileno, int age) {
        this.name = name;
        this.address = address;
        this.mobileno = mobileno;
        this.age = age;
    }

    public void display() {
        System.out.println(name + "," + age + "," + mobileno + "," + address);
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", mobileno=" + mobileno + ", age=" + age + '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("MS Dhoni", "Ranchi", "0335874326", 40);

        System.out.println(p1);

    }

}
