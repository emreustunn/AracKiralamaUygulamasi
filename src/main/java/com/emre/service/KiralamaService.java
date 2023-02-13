package com.emre.service;

import com.emre.repository.KiralamaRepository;
import com.emre.repository.entity.Arac;
import com.emre.repository.entity.Kiralama;
import com.emre.utility.MyFactoryService;

import java.util.List;

public class KiralamaService extends MyFactoryService<KiralamaRepository, Kiralama,Long> {
    public KiralamaService(){
        super(new KiralamaRepository());
    }

}
