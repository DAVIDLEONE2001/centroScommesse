package com.example.springsocial.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "scommessa")
public class Scommessa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_scommessa;

    @Column(name = "ris_casa", nullable = false)
    private int risultatoCasa;
    @Column(name = "ris_ospite", nullable = false)
    private int risultatoOspite;

}
