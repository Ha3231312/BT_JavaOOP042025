package Bai2.person;

public class Information {
    public static void main(String[] args) {
        Person person = new Person("Mai",30,"male", "123456", "Ha Noi");
        person.getName();
        person.getAge();
        person.getGender();
        person.getAddress();
        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getGender());
        System.out.println(person.getAddress());
    }
}
