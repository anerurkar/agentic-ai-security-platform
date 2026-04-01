# Simulating ₹25 Cr jewellery robbery prevention using Agentic AI
# Agentic AI Security Platform (Spring Boot)

Simulates autonomous detection → decision → response for robbery prevention.

## Run
mvn spring-boot:run

## Test
POST /security/event
{
  "type": "WEAPON",
  "location": "Store-101"
}
