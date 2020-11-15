package de.agnesb.baufinanzierung.app;


import de.agnesb.baufinanzierung.app.model.api.AngebotData;
import de.agnesb.baufinanzierung.app.shared.exceptions.AngebotNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@RequiredArgsConstructor
public class BauFinanzierungService {

    public AngebotData findFinanzierungById(Long id) {
        // TODO Repositories, Mapper
        if(id.equals(Long.valueOf(666))) {
            throw new AngebotNotFoundException("Angebot id=[" + id + "]");
        }
        return new AngebotData(1, 1, 1, "TolleBank" , 100, 1000, 1, LocalDate.now().plusMonths(1));
    }

    public AngebotData calculateFinanzierung() {
        return new AngebotData(1.17, 1.2, 55.56, "Musterbank", 264, 100000, 10, LocalDate.now().plusMonths(1));
    }
}
