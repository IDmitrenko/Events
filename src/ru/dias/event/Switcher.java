package ru.dias.event;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    private List<ElectricityConsumer> listeners = new ArrayList<>();

    // подписка на событие
    public void addElecricityListener(ElectricityConsumer listener) {
        listeners.add(listener);
    }

    // отписка на событие
    public void removeElecricityListener(ElectricityConsumer listener) {
        listeners.remove(listener);
    }

    public void switchOn() {
        System.out.println("Выключатель включён");
        for (ElectricityConsumer c : listeners) {
            c.electicityOn();
        }
    }
}
