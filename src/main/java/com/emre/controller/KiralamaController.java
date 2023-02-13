package com.emre.controller;

import com.emre.repository.entity.Arac;
import com.emre.repository.entity.Kiralama;
import com.emre.service.AracService;
import com.emre.service.KiralamaService;
import com.emre.service.KisiService;

import java.util.Scanner;

public class KiralamaController {
    private Scanner scanner;
    private KiralamaService kiralamaService;
    private AracService aracService;
    private KisiService kisiService;

    public KiralamaController(){
        scanner = new Scanner(System.in);
        kiralamaService = new KiralamaService();
        aracService = new AracService();
        kisiService = new KisiService();
    }

    public void kiralamaYap() {
        aracService.findAll().forEach(x->{
            if(!x.isKiradaMi()){
                System.out.println(x);
            }
        });
        System.out.println("Kiralama yapacaginiz aracin id'sini giriniz...: ");
        Long aracId = scanner.nextLong();

        kisiService.findAll().forEach(System.out::println);
        System.out.println("Araci kiralayacak kisinin id'sini giriniz...: ");
        Long kisiId = scanner.nextLong();

        Kiralama kiralama = Kiralama.builder()
                .kiralananAracId(aracId)
                .kiralayanKisiId(kisiId)
                .build();

        //kiralanan araci true konuma getirmek.
        Arac arac = aracService.findById(aracId).get();
        arac.setKiradaMi(true);
        aracService.update(arac);

        kiralamaService.save(kiralama);
        System.out.println("arac basari ile kiralandı");

    }
}
