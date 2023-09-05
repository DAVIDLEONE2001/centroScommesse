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
@Table(name = "giornata")
public class Giornata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_giornata;

    @Column(name="data_in",nullable = false)
    private LocalDate data_in;

    @Column(name="data_out",nullable = false)
    private LocalDate data_out;

}
