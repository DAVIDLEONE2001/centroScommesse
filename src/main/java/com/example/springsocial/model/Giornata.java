package com.example.springsocial.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Giornata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_giornata;

    @Column(nullable = false)
    private LocalDate data_in;

    @Column(nullable = false)
    private LocalDate data_out;

}
