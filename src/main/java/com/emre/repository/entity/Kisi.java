package com.emre.repository.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@NamedQueries({
        @NamedQuery(name = "Kisi.herhangiMusterininKiraladigiAraclar",
                query = "select k.kiralananAracId from Kiralama k where k.kiralayanKisiId = :musteriId"),
})
public class Kisi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private String email;
    private Long yas;
}
