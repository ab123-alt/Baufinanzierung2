package de.agnesb.baufinanzierung.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ImmobilieData {
    private AdresseData adresse;
    private ImmobilieTyp artDerImmobilie;
    private double groesseGrundstueck;
}
