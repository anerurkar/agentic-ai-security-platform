
package com.agentic.security.agents;

import com.agentic.security.model.Event;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class DetectionAgent {
    public List<String> detect(Event event) {
        if ("HELMET".equalsIgnoreCase(event.type))
            return List.of("HELMET", "PERSON");
        if ("WEAPON".equalsIgnoreCase(event.type))
            return List.of("WEAPON", "PERSON");
        return List.of("PERSON");
    }
}
