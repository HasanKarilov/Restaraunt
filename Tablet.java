package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Order;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Tablet {
    private static Logger logger = Logger.getLogger(Tablet.class.getName());

    final int number;

    public Tablet(int number) {
        this.number = number;
    }

    /**
     * Создает заказ из тех блюд, которые выберет пользователь
     */
    public void createOrder(){
        try{
            Order order = new Order(this);

        }catch (IOException e){
            logger.log(Level.SEVERE, "Console is unavailable.");
        }

    }

    @Override
    public String toString() {
        return "Tablet{" + "number=" + number+'}';
    }
}
