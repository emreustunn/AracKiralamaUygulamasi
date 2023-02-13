package com.emre;

import com.emre.controller.AracController;
import com.emre.controller.KiralamaController;
import com.emre.controller.KisiController;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    AracController aracController = new AracController();
    KisiController kisiController = new KisiController();
    KiralamaController kiralamaController = new KiralamaController();

    public void anaMenu() {
        int secim;
        do {
            System.out.println("*****************************************");
            System.out.println("******** ARAC KIRALAMA UYGULAMASI  ******");
            System.out.println("*****************************************");
            System.out.println("1. Musteri Ekle");
            System.out.println("2. Arac Ekle");
            System.out.println("3. Kiralama Yap");
            System.out.println("4. Raporlar");
            System.out.println("0. CIKIS");
            secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    kisiController.musteriEkle();
                    break;
                case 2:
                    aracController.aracEkle();
                    break;
                case 3:
                    kiralamaController.kiralamaYap();
                    break;
                case 4:
                    raporlamalar();
                    break;
            }
        } while (secim != 0);

    }

    private void raporlamalar() {
        int secim;
        do {
            System.out.println("1. Suan kirada olan araclar");
            System.out.println("2. Bosta olan araclar");
            System.out.println("3. Herhangi bir musterinin kiraladigi araclar");
            System.out.println("0. <<< Geri");
            secim = scanner.nextInt();
            switch (secim) {
                case 1:
                    aracController.kiradaOlanAraclar();
                    break;
                case 2:
                    aracController.bostaOlanAraclar();
                    break;
                case 3:
                    kisiController.herhangiMusterininKiraladigiAraclar();
                    break;
            }
        } while (secim != 0);


    }
}
