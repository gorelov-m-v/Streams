package duck;

// Выделите абстрактный класс Duck,
// который будет содержать общие свойства и методы классов FlyingDuck и RubberDuck
abstract class Duck {
    public abstract String getName();

    public abstract void swim();

    public void quack() {
        System.out.println("Кря!");
    }
}

class FlyingDuck extends Duck {
    @Override
    public String getName() {
        return "Я - обычная утка. Кря!";
    }
    @Override
    public void swim() {
        System.out.println("Да, я умею плавать!");
    }

    public void fly() {
        System.out.println("Лечу куда хочу.");
    }

    public void eat() {
        System.out.println("Обычно кушаю разные семена, но иногда нахожу хлебушек.");
    }
}

class RubberDuck extends Duck {
    @Override
    public String getName() {
        return "Я - резиновая уточка!";
    }
    @Override
    public void swim() {
        System.out.println("Да, я умею плавать!");
    }


}


public class Practicum {

    public static void main(String[] args) {
        FlyingDuck flyingDuck = new FlyingDuck();
        RubberDuck rubberDuck = new RubberDuck();

        System.out.println("Сначала о себе расскажет обычная уточка:");
        System.out.println(flyingDuck.getName());
        flyingDuck.swim();
        flyingDuck.fly();
        flyingDuck.eat();
        flyingDuck.quack();

        System.out.println("А теперь - резиновая:");
        System.out.println(rubberDuck.getName());
        rubberDuck.swim();
        rubberDuck.quack();
    }

}