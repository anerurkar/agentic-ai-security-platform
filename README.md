# Real-world inspired POC: Preventing high-value jewellery robbery using Agentic AI
# Agentic AI Security Platform (Spring Boot)
# 🏗️ Architecture Diagram
# High level flow
        ┌──────────────┐
        │   CCTV /     │
        │  Edge Input  │
        └──────┬───────┘
               │
               ▼
        ┌──────────────┐
        │ Detection    │
        │   Agent      │
        │ (Helmet/     │
        │  Weapon)     │
        └──────┬───────┘
               │
               ▼
        ┌──────────────┐
        │ Threat       │
        │ Assessment   │
        │   Agent      │
        │ (Score + AI) │
        └──────┬───────┘
               │
               ▼
        ┌──────────────┐
        │ Response     │
        │   Agent      │
        │ (Alert /     │
        │ Lockdown)    │
        └──────┬───────┘
               │
               ▼
        ┌──────────────┐
        │ Communication│
        │   Agent      │
        │ (Police/API) │
        └──────┬───────┘
               │
               ▼
        ┌──────────────┐
        │ External     │
        │ Systems      │
        │ (Police/IoT) │
        └──────────────┘
# Agentic Orchesstration Layer
              ┌────────────────────────────┐
              │   Security Orchestrator    │
              │                            │
              │  Detect → Assess → Decide  │
              │            → Act           │
              └────────────┬───────────────┘
                           │
      ┌──────────────┬──────────────┬──────────────┐
      ▼              ▼              ▼              ▼
Detection Agent  Threat Agent  Response Agent  Communication Agent

# event driven future kafka
Detection Event  →  Threat Event  →  Response Event  →  Alert Event
      │                  │                │                │
      ▼                  ▼                ▼                ▼
  Kafka Topic       Kafka Topic     Kafka Topic     Kafka Topic

  #Azure Deployment Mapping
  CCTV / Edge Device
        │
        ▼
 Azure IoT Hub
        │
        ▼
 Azure Event Hub (Streaming)
        │
        ▼
 Azure Kubernetes Service (AKS)
   ├── Detection Service
   ├── Threat Service (Spring AI)
   ├── Response Service
   └── Communication Service
        │
        ▼
 Azure Cosmos DB (Audit / Logs)
        │
        ▼
 Police API / SMS / Alert Systems

 # Key Capabilities
 ✔ Real-time anomaly detection
✔ Autonomous decision making
✔ Instant response (no human delay)
✔ Scalable microservices architecture
✔ Cloud-native (Azure ready)


Simulates autonomous detection → decision → response for robbery prevention.

## Run
mvn spring-boot:run

## Test
POST /security/event
{
  "type": "WEAPON",
  "location": "Store-101"
}
