package com.javarush.task.task27.task2712.ad;

/**
 * Хранилище рекламных роликов
 */
public class AdvertisementStorage {
    private AdvertisementStorage(){}

    private final static AdvertisementStorage instance = new AdvertisementStorage();

    public static AdvertisementStorage getInstance() {
        return instance;
    }
}
