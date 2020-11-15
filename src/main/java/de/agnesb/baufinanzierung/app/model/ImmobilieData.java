package de.agnesb.baufinanzierung.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
@AllArgsConstructor
public class ImmobilieData {
    @NotNull
    private AdresseData adresse;
    @NotNull
    private ImmobilieTyp artDerImmobilie;
    @NotNull
    private double groesseGrundstueck;
}
