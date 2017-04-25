package com.javarush.task.task27.task2712.kitchen;


public enum Dish {
    Fish(25),
    Steak(30),
    Soup(15),
    Juice(5),
    Water(3);

    private int duration;

    private Dish(int duration){
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public static String allDishesToString(){
        StringBuilder sb = new StringBuilder();
        for(Dish dish: Dish.values()){

            sb.append(dish);
            if(dish.ordinal() != Dish.values().length-1){
                sb.append(", ");
            }
        }
        return sb.toString();
    }
}