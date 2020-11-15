package de.agnesb.baufinanzierung.app.model.api;

import de.agnesb.baufinanzierung.app.model.AntragstellerData;
import de.agnesb.baufinanzierung.app.model.FinanzierungsvorhabenData;
import de.agnesb.baufinanzierung.app.model.ImmobilieData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Getter
@Setter
@ToString
@AllArgsConstructor
// TODO Validierung der DTOs
public class CreateAngebotData {

    @NotNull @Valid
    private AntragstellerData antragstellerData;
    @NotNull @Valid
    private ImmobilieData immobilienData;
    @NotNull @Valid
    private FinanzierungsvorhabenData finanzierungsvorhabenData;
}
