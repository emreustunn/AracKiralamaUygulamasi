package com.emre.repository;

import com.emre.repository.entity.Arac;
import com.emre.repository.entity.Kisi;
import com.emre.utility.MyFactoryRepository;

import javax.persistence.TypedQuery;
import java.util.List;

public class KisiRepository extends MyFactoryRepository<Kisi,Long> {
    public KisiRepository(){
        super(new Kisi());
    }
    public List<Long> herhangiMusterininKiraladigiAraclar(Long musteriId){
        TypedQuery<Long> typedQuery = getEntityManager()
                .createNamedQuery("Kisi.herhangiMusterininKiraladigiAraclar",Long.class);
        typedQuery.setParameter("musteriId",musteriId);
        List<Long> araclarinIdListesi = typedQuery.getResultList();
        return araclarinIdListesi;
    }
}
