package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventDataRow;


import java.util.Observable;
import java.util.Observer;

public class Cook extends Observable implements Observer
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

    /**
     * @param tablet (Observable) - объект, который отправил нам значение
     * @param order (Object)- само значение, в нашем случае - это объект Order
     */
    @Override
    public void update(Observable tablet, Object order)
    {
        Order order1 = (Order) order;
        ConsoleHelper.writeMessage("Start cooking - " + order1 + ", cooking time " + order1.getTotalCookingTime() +"min");

        EventDataRow eventDataRow =
        new CookedOrderEventDataRow(tablet.toString(), name, order1.getTotalCookingTime() * 60, order1.getDishes());
        StatisticManager.getInstance().register(eventDataRow);

        setChanged();
        notifyObservers(order);
    }
}