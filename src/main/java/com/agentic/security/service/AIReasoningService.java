
package com.agentic.security.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AIReasoningService {
    public String analyze(List<String> detections, int score) {
        if (score > 80) return "High risk: possible robbery";
        if (score > 40) return "Medium risk: suspicious activity";
        return "Normal activity";
    }
}
