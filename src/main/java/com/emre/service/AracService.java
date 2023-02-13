package com.emre.service;

import com.emre.repository.AracRepository;
import com.emre.repository.entity.Arac;
import com.emre.utility.MyFactoryService;

public class AracService extends MyFactoryService<AracRepository, Arac,Long> {
    public AracService(){
        super(new AracRepository());
    }
}
