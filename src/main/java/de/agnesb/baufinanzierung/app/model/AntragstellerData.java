package de.agnesb.baufinanzierung.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class AntragstellerData {

    private String vorname;
    @NotBlank(message = "Last name is mandatory")
    private String nachname;
    private String phone;
    private String mail;
    private LocalDate geburtsdatum;
    private String geburtsort;
    private String weitereKontaktMoeglichkeiten;
    private AdresseData adresseData;
}
