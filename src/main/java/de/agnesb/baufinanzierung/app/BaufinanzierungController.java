package de.agnesb.baufinanzierung.app;


import de.agnesb.baufinanzierung.app.model.*;
import de.agnesb.baufinanzierung.app.model.api.AngebotData;
import de.agnesb.baufinanzierung.app.model.api.CreateAngebotData;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;

@RestController
@RequestMapping("/v1/baufinanzierung")
@RequiredArgsConstructor
@Slf4j
public class BaufinanzierungController {

    private final BauFinanzierungService bauFinanzierungService;

    @GetMapping("/{angebotId}")
    public ResponseEntity<AngebotData> finanzierungFinden(
            @PathVariable(value = "angebotId") Long vorgangId) {
        log.info("finding Angebot with id {}", vorgangId);
        return ResponseEntity.ok(bauFinanzierungService.findFinanzierungById(vorgangId));
    }

    @PostMapping()
    public ResponseEntity<AngebotData> finanzierungBerechnen(
            @Valid @RequestBody CreateAngebotData createAngebotData) {
        log.info("creating Angebot from data {}", createAngebotData);
        return ResponseEntity.ok(bauFinanzierungService.calculateFinanzierung());
    }

    // -------------------------------------------- temporary testing methods ------------------------------------//

    @GetMapping("/antragsteller")
    public ResponseEntity<AntragstellerData> antragstellerFinden()
    {
        log.info("finding antragsteller");
        AdresseData adresse = AdresseData.builder().strasse("strasse").hausnummer(1).ort("ort").plz("12345").build();
        return ResponseEntity.ok(new AntragstellerData("vorname", "nachname", "phone", "mail", LocalDate.of(2000, 11, 14), "gebOrt", "kontakt", adresse));
    }

    @PostMapping("/antragsteller")
    public ResponseEntity<AntragstellerData> antragstellerAnlegen(
            @Valid @RequestBody AntragstellerData antragsteller) {
        log.info("posting antragsteller {}", antragsteller);
        return ResponseEntity.ok(antragsteller);
    }
}
