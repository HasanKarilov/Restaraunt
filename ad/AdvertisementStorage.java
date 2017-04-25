package com.javarush.task.task27.task2712.ad;

import java.util.ArrayList;
import java.util.List;

/**
 * Хранилище рекламных роликов
 */
public class AdvertisementStorage {
    private final static AdvertisementStorage instance = new AdvertisementStorage();

    private AdvertisementStorage(){
        Object someContent = new Object();
        new Advertisement(someContent, "First Video", 5000, 100, 3 * 60); // 3 min
        new Advertisement(someContent, "Second Video", 100, 10, 15 * 60); //15 min
        new Advertisement(someContent, "Third Video", 400, 2, 10 * 60);  //10 min
    }

    public static AdvertisementStorage getInstance() {
        return instance;
    }

    private final List<Advertisement> videos = new ArrayList<>();

    // list() - который вернет список всех существующих доступных видео.
    public List<Advertisement> list(){
        return videos;
    }

    // add(Advertisement advertisement) - который добавит новое видео в список videos.
    public void add(Advertisement advertisement){
        this.videos.add(advertisement);
    }
}
