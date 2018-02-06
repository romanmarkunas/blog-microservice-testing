# Exchange fees service

## Endpoints
#### Get fees endpoint
Location: GET "/" \
Required parameters: stock \
Returns: JSON with exchange fees for LSE, NYSE, JPX \
Example: localhost:8080/?stock=AAPL

## Deployment
`./gradlew run -Dserver.port=8080` \
Note! Change port to available on your machine
