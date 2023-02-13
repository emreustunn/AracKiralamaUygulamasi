package com.emre.repository.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Arac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String marka;
    String model;
    Long ucret;
    boolean kiradaMi;

    public boolean isKiradaMi() {
        return kiradaMi;
    }

    public void setKiradaMi(boolean kiradaMi) {
        this.kiradaMi = kiradaMi;
    }
}
