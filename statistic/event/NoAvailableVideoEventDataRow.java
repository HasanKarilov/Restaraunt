package com.javarush.task.task27.task2712.statistic.event;

import java.util.Date;

/**
 * Created by hanaria on 4/25/17.
 */
public class NoAvailableVideoEventDataRow implements EventDataRow {

    private int totalDuration; // время приготовления заказа в секундах
    private Date currentDate;

    public NoAvailableVideoEventDataRow(int totalDuration) {
        this.totalDuration = totalDuration;
        this.currentDate = new Date();
    }
}