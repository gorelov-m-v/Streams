package http.serial;

import com.google.gson.Gson;

public class Practicum {

    public static void main(String[] args) {

        Owner owner = new Owner("John", "Weak");
        Dog dog = new Dog("Пес", owner, 12);

        Gson gson = new Gson();

        String jsonString = gson.toJson(dog);
        System.out.println(jsonString);

        String newJsonString = "{\"name\":\"Тузик\",\"owner\":{\"name\":\"Игорь\",\"surname\":\"Петров\"},\"age\":3}";

        Dog newDog = gson.fromJson(newJsonString, Dog.class);

        System.out.println("Собака:");
        System.out.println("Кличка: " + newDog.getName());
        System.out.println("Возраст: " + newDog.getAge());
        System.out.println("Владелец:");
        Owner newOwner = newDog.getOwner();
        System.out.println("Имя: " + newOwner.getName());
        System.out.println("Фамилия: " + newOwner.getSurname());

    }
}

class Dog {
    private String name;

    public Dog(String name, Owner owner, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private Owner owner;
    private int age;
}

class Owner {
    public Owner(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String name;
    private String surname;
}
