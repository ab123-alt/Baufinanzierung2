package de.agnesb.baufinanzierung.app.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AdresseData {
    private String strasse;
    private int hausnummer;
    private String plz;
    private String ort;
}
