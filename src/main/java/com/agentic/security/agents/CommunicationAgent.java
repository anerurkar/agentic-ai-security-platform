
package com.agentic.security.agents;

import com.agentic.security.model.ThreatContext;
import org.springframework.stereotype.Component;

@Component
public class CommunicationAgent {
    public void notify(ThreatContext ctx) {
        System.out.println("ALERT SENT");
        System.out.println("Action: " + ctx.action);
        System.out.println("Score: " + ctx.score);
        System.out.println("Reason: " + ctx.reasoning);
    }
}
