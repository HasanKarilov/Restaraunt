package com.javarush.task.task27.task2712.statistic;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;

import java.util.*;

/** С его помощью будем регистрировать события в хранилище
 * У нас должно быть одно хранилище с одной точкой входа
 */
public class StatisticManager {
    private class StatisticStorage{
        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();
        private StatisticStorage(){
            for(EventType eventType: EventType.values()){
                storage.put(eventType, new ArrayList<EventDataRow>());
            }
        }
        private void put(EventDataRow data){
            //Получая значение по ключу добавляем данные
            storage.get(data.getType()).add(data);
        }
    }

    private StatisticStorage statisticStorage = new StatisticStorage();
    private Set<Cook> cooks = new HashSet<>();

    private StatisticManager(){
    }
    private static StatisticManager instance = new StatisticManager();

    public static StatisticManager getInstance() {
        return instance;
    }

    public void register(EventDataRow data){
        this.statisticStorage.put(data);
    }
    public void register(Cook cook){
        cooks.add(cook);
    }
}
