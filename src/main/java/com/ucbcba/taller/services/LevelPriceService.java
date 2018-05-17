package com.ucbcba.taller.services;

import com.ucbcba.taller.entities.LevelPrice;


public interface LevelPriceService {
    Iterable<LevelPrice> listAllLevelPrices();

    void saveLevelPrice(LevelPrice levelPrice);

    LevelPrice getLevelPrice(Integer id);

    void deleteLevelPrice(Integer id);
}
