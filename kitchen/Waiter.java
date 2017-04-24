package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

public class Waiter implements Observer
{
    /**
     * @param cook   the observable object.
     * @param order an argument passed to the <code>notifyObservers</code>
     */
    @Override
    public void update(Observable cook, Object order) {
        ConsoleHelper.writeMessage(order + " was cooked by " + cook);
    }
}
