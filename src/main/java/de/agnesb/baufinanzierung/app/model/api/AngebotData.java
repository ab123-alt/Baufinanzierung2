package de.agnesb.baufinanzierung.app.model.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class AngebotData {

    private Double sollzins;
    private Double effektivzins;
    private Double beleihungsauslauf;
    private String produktanbieter;
    private Long monatlRate;
    private Long darlehenssumme;
    private int zinsbindung;
    private LocalDate annahmeFrist;
}
