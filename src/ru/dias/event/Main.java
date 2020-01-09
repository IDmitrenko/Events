package ru.dias.event;

public class Main {

    public static void fire() {
        System.out.println("Сообщение");
    }

    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // подписка на событие
        sw.addElecricityListener(lamp);
        sw.addElecricityListener(radio);
        // анонимный класс
        sw.addElecricityListener(
                new ElectricityConsumer() {
                    public void electicityOn() {
                        System.out.println("Пожар");
                    }
                }
        );
        // если есть функциональный интерфейс
        sw.addElecricityListener(
                () -> {
                    System.out.println("Короткое замыкание");
                }
        );

        sw.addElecricityListener(()->Main.fire());
        // :: вызов метода
        sw.addElecricityListener(Main::fire);

        // возможность доступа к переменным из анонимного класса (и лямбда-выражения)
        // вне контекста этого класса
        final String message = "Вода";
        sw.addElecricityListener(
                new ElectricityConsumer() {
                    public void electicityOn() {
                        System.out.println(message);
                    }
                }
        );

        sw.switchOn();


    }
}
