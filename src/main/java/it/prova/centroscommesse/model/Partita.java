package it.prova.centroscommesse.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "partita")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Partita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "giornata_id")
    private Giornata giornata;

    @Column(name = "squadra_casa")
    private String squadraCasa;

    @Column(name = "squadra_ospite")
    private String squadraOspite;

    @Column(name = "risultato_squadra_casa")
    private Integer risultatoSquadraCasa;

    @Column(name = "risultato_squadra_ospite")
    private Integer risultatoSquadraOspite;

}
