package it.prova.centroscommesse.model;

import lombok.*;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "scommessa")
public class Scommessa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ris_casa", nullable = false)
    private int risultatoCasa;
    @Column(name = "ris_ospite", nullable = false)
    private int risultatoOspite;

    @JoinColumn(name = "partita_id")
    @ManyToOne
    private Partita partita;

    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;



}
