
package com.agentic.security.controller;

import com.agentic.security.model.Event;
import com.agentic.security.model.ThreatContext;
import com.agentic.security.orchestrator.SecurityOrchestrator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/security")
public class SecurityController {

    private final SecurityOrchestrator orchestrator;

    public SecurityController(SecurityOrchestrator orchestrator) {
        this.orchestrator = orchestrator;
    }

    @PostMapping("/event")
    public ThreatContext process(@RequestBody Event event) {
        return orchestrator.process(event);
    }

    @GetMapping("/demo")
    public String demo() {
        return "Agentic AI Security Running";
    }
}
