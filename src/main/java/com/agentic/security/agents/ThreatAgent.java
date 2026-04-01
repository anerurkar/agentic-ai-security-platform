
package com.agentic.security.agents;

import com.agentic.security.model.ThreatContext;
import com.agentic.security.service.AIReasoningService;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ThreatAgent {

    private final AIReasoningService ai;

    public ThreatAgent(AIReasoningService ai) {
        this.ai = ai;
    }

    public ThreatContext assess(List<String> detections) {
        int score = 0;
        if (detections.contains("HELMET")) score += 50;
        if (detections.contains("WEAPON")) score += 80;
        if (detections.contains("PERSON")) score += 20;

        ThreatContext ctx = new ThreatContext();
        ctx.score = score;
        ctx.reasoning = ai.analyze(detections, score);
        return ctx;
    }
}
