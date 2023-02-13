package com.emre.repository;

import com.emre.repository.entity.Arac;
import com.emre.repository.entity.Kiralama;
import com.emre.utility.MyFactoryRepository;

import javax.persistence.TypedQuery;
import java.util.List;

public class KiralamaRepository extends MyFactoryRepository <Kiralama,Long> {
    public KiralamaRepository(){
        super(new Kiralama());
    }

}
