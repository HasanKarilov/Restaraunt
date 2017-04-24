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
/*
6. Чтобы пользователь мог выбрать себе блюда, нужно их все ему отобразить. Для этого в Dish создай метод
public static String allDishesToString(), который сформирует строку из всех блюд.
Пример: "Fish, Steak, Soup, Juice, Water". Формируй строку динамически.
 */