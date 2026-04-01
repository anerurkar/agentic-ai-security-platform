
package com.agentic.security.agents;

import org.springframework.stereotype.Component;

@Component
public class ResponseAgent {
    public String decide(int score) {
        if (score > 80) return "LOCKDOWN";
        if (score > 40) return "ALERT";
        return "NORMAL";
    }
}
