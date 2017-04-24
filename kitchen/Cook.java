package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;


import java.util.Observable;
import java.util.Observer;

public class Cook implements Observer
{
    public final String name;
    public Cook(String name)
    {
        this.name = name;
    }
    @Override
    public String toString()
    {
        return name;
    }
//    /**
//     * @param //tablet (Observable) - объект, который отправил нам значение
//     * @param //order (Object)- само значение, в нашем случае - это объект Order
//     */

    @Override
    public void update(Observable observable, Object arg)
    {
        ConsoleHelper.writeMessage("Start cooking - " + arg);
    }
}