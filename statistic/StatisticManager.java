package com.javarush.task.task27.task2712.statistic;

import com.javarush.task.task27.task2712.statistic.event.EventDataRow;

/** С его помощью будем регистрировать события в хранилище
 * У нас должно быть одно хранилище с одной точкой входа
 */
public class StatisticManager {
    private StatisticManager(){
    }
    private static StatisticManager instance = new StatisticManager();

    public static StatisticManager getInstance() {
        return instance;
    }

    public void register(EventDataRow data){

    }
}
