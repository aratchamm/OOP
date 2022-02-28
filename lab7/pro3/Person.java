package pro3;

public class Person {

    public String name;
    public String address;
    public String phoneNumber;
    public String emailAddress;

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{name=" + this.name +
                ", address=" + this.address +
                ", phoneNumber=" + this.phoneNumber +
                ", emailAddress=" + this.emailAddress + "} ";
    }
}
