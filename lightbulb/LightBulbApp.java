package seminar6.lightbulb;

//Dependency inversion principle
//Принцип инверсии зависимостей
//        - модули высокого уровня не должны зависеть
//        от модулей нижнего уровня.
//        И те, и другие должны зависеть от абстракций.
//        - абстракции не должны зависеть от деталей.
//        Детали должны зависеть от абстракций.

public class LightBulbApp {
    public static void main(String[] args) {
        Switch switchBulb = new Switch();
        switchBulb.operate();

    }
}
interface LightBulb {
    void turnOn();

    void turnOff();
}

class Bulb implements LightBulb {

    @Override
    public void turnOn() {
        System.out.println("Лампочка включена");
    }

    @Override
    public void turnOff() {
        System.out.println("Лампочка выключена");
    }
}

class Switch {
    private LightBulb bulb;

    public Switch() {
        this.bulb = new Bulb();
    }

    public void operate() {
        // Работа с выключателем
        bulb.turnOn();
        bulb.turnOff();
    }
}