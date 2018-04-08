package optional;

import java.util.Optional;

public class Person {

    private String name;
    private String lastName;
    private Integer age;


    //    public String getName() {
//        return name;
//    }
    public Optional<String> getName() {
        return Optional.ofNullable(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    //    public String getLastName() {
//        return lastName;
//    }
    public Optional<String> getLastName() {
        return Optional.ofNullable(lastName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //    public Integer getAge() {
//        return age;
//    }
    public Optional<Integer> getAge() {
        return Optional.ofNullable(age);
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + Optional.ofNullable(name).orElse("") + '\'' +
                ", lastName='" + Optional.ofNullable(lastName).orElse("") + '\'' +
                ", age=" + Optional.ofNullable(age).orElse(0) +
                '}';
    }

    public static void main(String[] args) {
        // 1
        Person person = new Person();
        person.setName("John");

        person.getName().ifPresent(System.out::println);

        // 2
        System.out.println(person.getName().map(value -> "imie: "+value).orElse("brak Imienia!"));
        System.out.println(person.getLastName().map(value -> "nazwisko: " +value).orElse("brak nazwiska !"));

//        // 3
        System.out.println("");
        person.getName().ifPresent(System.out::println);
        System.out.println(person.getLastName().map(value -> "nazwisko: " + value).orElse("brak nazwiska !"));
        person.setAge(22);
        System.out.println(person.getAge()
                .filter(age -> age >= 18)
                .map(age -> "wiek: " + age + ". Osoba pełnoletnia")
                .orElse("Osoba niepełnoletnia"));
    }
}