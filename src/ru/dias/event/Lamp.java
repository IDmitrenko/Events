package ru.dias.event;

public class Lamp implements ElectricityConsumer {

    public void lightOn() {
        System.out.println("Лампа зажглась");
    }

    @Override
    public void electicityOn() {
        lightOn();
    }
}
