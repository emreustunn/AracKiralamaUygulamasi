package com.emre.repository;

import com.emre.repository.entity.Arac;
import com.emre.utility.MyFactoryRepository;

public class AracRepository extends MyFactoryRepository<Arac,Long> {
    public AracRepository(){
        super (new Arac());
    }
}
