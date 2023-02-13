package com.emre.controller;

import com.emre.repository.entity.Kisi;
import com.emre.service.AracService;
import com.emre.service.KisiService;

import java.util.Scanner;

public class KisiController {
    private Scanner scanner;
    private KisiService kisiService;
    private AracService aracService;

    public KisiController(){
        scanner=new Scanner(System.in);
        kisiService= new KisiService();
        aracService = new AracService();
    }


    public void musteriEkle() {
        System.out.print("Musterinin adi..: ");
        String ad = scanner.nextLine();
        System.out.print("Musterinin soyadi..: ");
        String soyad = scanner.nextLine();
        System.out.print("Musterinin email adresi..: ");
        String email =scanner.nextLine();
        System.out.print("Musterinin yasi..: ");
        Long yas = scanner.nextLong();

        Kisi kisi = Kisi.builder()
                .name(ad)
                .surname(soyad)
                .yas(yas)
                .email(email)
                .build();
        kisiService.save(kisi);
    }

    public void herhangiMusterininKiraladigiAraclar() {
        kisiService.findAll().forEach(System.out::println);
        System.out.print("Istenilen kisinin id'sini giriniz....: ");
        Long kisiId = scanner.nextLong();
        kisiService.herhangiMusterininKiraladigiAraclar(kisiId).forEach(x->{
            System.out.println(aracService.findById(x));
        });
    }
}
