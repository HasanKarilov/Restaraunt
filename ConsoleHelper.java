package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by hanaria on 4/24/17.
 */
public class ConsoleHelper {
    private final static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

    public static void writeMessage(String message)
    {
        System.out.println(message);
    }

    public static String readString() throws IOException
    {
        return bis.readLine();
    }

    public static List<Dish> getAllDishesForOrder() throws IOException
    {
        writeMessage(Dish.allDishesToString());
        writeMessage("Please choose dishes you want: ");

        List<Dish> dishes = new ArrayList<>();

        while (true){
           String name = bis.readLine();
           if(name.equals("exit")) break;

           try{
               Dish dish = Dish.valueOf(name);
               dishes.add(dish);
           }
           catch (IllegalArgumentException e){
               writeMessage(name + " not detected!");
           }
        }
        return dishes;
    }
}
