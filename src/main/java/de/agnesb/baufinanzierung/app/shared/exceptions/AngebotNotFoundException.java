package de.agnesb.baufinanzierung.app.shared.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "entity does not exist")
public class AngebotNotFoundException extends RuntimeException {
    public AngebotNotFoundException(String entityName) {
        super("Entity " + entityName + " does not exist");
    }
}
