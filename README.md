# Axon Project

## Get Started

### Generate Docker Images for each service

```
./service1/gradlew jibDockerBuild -p ./service1/ --image=rommik-service1 &&
./graphql-server/gradlew jibDockerBuild -p ./graphql-server --image rommik-graphql
```

### Start all Services

```
docker-compose up
```

### GraphQL 

Open `http://localhost:8080/graphiql`