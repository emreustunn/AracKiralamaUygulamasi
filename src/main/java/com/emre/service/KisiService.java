package com.emre.service;

import com.emre.repository.KisiRepository;
import com.emre.repository.entity.Arac;
import com.emre.repository.entity.Kisi;
import com.emre.utility.MyFactoryService;

import java.util.List;

public class KisiService extends MyFactoryService<KisiRepository, Kisi,Long> {
    public KisiService(){
        super(new KisiRepository());
    }
    public List<Long> herhangiMusterininKiraladigiAraclar(Long musteriId){
        return getRepository().herhangiMusterininKiraladigiAraclar(musteriId);
    }
}
