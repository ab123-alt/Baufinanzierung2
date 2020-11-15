package de.agnesb.baufinanzierung.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
//TODO check data types
public class FinanzierungsvorhabenData {
    private DarlehenZweck darlehenzweck;
    private long kaufpreis;
    private long mobiliarKosten;
    private long sonstigeKosten;
    private double grunderwerbSteuer;
    private double notargebuehren;
    private double maklergebuehren;
    private boolean wirdModernisiert;
}
