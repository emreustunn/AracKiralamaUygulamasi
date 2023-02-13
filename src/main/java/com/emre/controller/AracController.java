package com.emre.controller;

import com.emre.repository.entity.Arac;
import com.emre.service.AracService;

import java.util.Scanner;

public class AracController {
    private Scanner scanner;
    private AracService aracService;

    public AracController(){
        scanner = new Scanner(System.in);
        aracService = new AracService();
    }


    public void aracEkle() {
        System.out.print("Aracin markasi ...: ");
        String marka = scanner.nextLine();
        System.out.print("Aracin modeli ...: ");
        String model = scanner.nextLine();
        System.out.print("Aracin ucreti ...: ");
        Long ucret = scanner.nextLong();
        Arac arac = Arac.builder()
                .marka(marka)
                .model(model)
                .ucret(ucret)
                .kiradaMi(false)
                .build();
        aracService.save(arac);
    }

    public void kiradaOlanAraclar() {
        System.out.println("Kirada olan araclarin listesi.....: ");
        aracService.findAllByColumnNameAndValue2("kiradaMi",Boolean.TRUE)
                .forEach(System.out::println);
    }

    public void bostaOlanAraclar() {
        System.out.println("Bosta olan araclarin listesi .....: ");
        aracService.findAllByColumnNameAndValue2("kiradaMi",Boolean.FALSE)
                .forEach(System.out::println);
    }
}
