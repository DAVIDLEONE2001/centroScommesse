package com.example.springsocial.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "giornata")
public class Giornata {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="data_in")
    private LocalDate data_in;

    @Column(name="data_out")
    private LocalDate data_out;

}
