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

    private Long kaufpreis;
    private Long mobiliarKosten;
    private Long sonstigeKosten;
    private Double grunderwerbSteuer;
    private Double notargebuehren;
    private Double maklergebuehren;
    private boolean wirdModernisiert;
}
