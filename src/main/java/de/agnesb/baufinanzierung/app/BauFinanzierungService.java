package de.agnesb.baufinanzierung.app;

import de.agnesb.baufinanzierung.app.model.api.AngebotData;
import de.agnesb.baufinanzierung.app.shared.exceptions.AngebotNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
// TODO Repositories, Mapper
public class BauFinanzierungService {

    public AngebotData findFinanzierungById(Long id) {
        if(id.equals(Long.valueOf(666))) {
            throw new AngebotNotFoundException("Angebot id=[" + id + "]");
        }
        return new AngebotData(1.0, 1.0, 1.0, "TolleBank" , 100L, 1000L, 1, LocalDate.now().plusMonths(1));
    }

    public AngebotData calculateFinanzierung() {
        return new AngebotData(1.17, 1.2, 55.56, "Musterbank", 264L, 100000L, 10, LocalDate.now().plusMonths(1));
    }
}
