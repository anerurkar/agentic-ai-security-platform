
package com.agentic.security.orchestrator;

import com.agentic.security.agents.*;
import com.agentic.security.model.*;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class SecurityOrchestrator {

    private final DetectionAgent detection;
    private final ThreatAgent threat;
    private final ResponseAgent response;
    private final CommunicationAgent communication;

    public SecurityOrchestrator(DetectionAgent d, ThreatAgent t, ResponseAgent r, CommunicationAgent c) {
        this.detection = d;
        this.threat = t;
        this.response = r;
        this.communication = c;
    }

    public ThreatContext process(Event event) {
        List<String> detections = detection.detect(event);
        ThreatContext ctx = threat.assess(detections);
        ctx.action = response.decide(ctx.score);

        if (!"NORMAL".equals(ctx.action)) {
            communication.notify(ctx);
        }
        return ctx;
    }
}
