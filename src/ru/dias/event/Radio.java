package ru.dias.event;

public class Radio implements ElectricityConsumer {

    public void playMusic() {

        System.out.println("Радио заиграло");
    }

    @Override
    public void electicityOn() {
        playMusic();
    }
}
