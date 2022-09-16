# Axon Demo Project

This repository demonstates how to use Axon Server, Axon Based Applications in a microservices & event-driven architecture.

GraphQL is used here for you to issue commands(mutations) or Query Data.

## Quick Start

### Generate Docker Images for each service

From the `root` of the cloned repository execute the commands below.

```
./service1/gradlew jibDockerBuild -p ./service1/ --image=rommik-service1 &&
./graphql-server/gradlew jibDockerBuild -p ./graphql-server --image rommik-graphql
```

### Start all Services

```
docker-compose up
```

### GraphQL 

1. Open `http://localhost:8080/graphiql`
2. Create a new Show and then Query your shows.