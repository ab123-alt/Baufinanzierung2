package de.agnesb.baufinanzierung.app.model.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
public class AngebotData {
    private double sollzins;
    private double effektivzins;
    private double beleihungsauslauf;
    private String produktanbieter;
    private long monatlRate;
    private long darlehenssumme;
    private int zinsbindung;
    private LocalDate annahmeFrist;
}
