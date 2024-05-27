package ru.sorokova.simulator._main;

import ru.sorokova.simulator.model.Bear;
import ru.sorokova.simulator.util.EventSimulator;

public class Main {

    public static void main(String[] args) {
        Bear bear = new Bear();
        EventSimulator eventSimulator = new EventSimulator();

        eventSimulator.startSimulator(bear);
    }
}
