package com.javarush.task.task27.task2712.kitchen;


public enum Dish {
    Fish,
    Steak,
    Soup,
    Juice,
    Water;

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