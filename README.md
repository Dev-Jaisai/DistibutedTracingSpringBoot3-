# Distributed Tracing with Spring Boot 3, Zipkin, and Feign

This project demonstrates distributed tracing across microservices using Spring Boot 3, Micrometer Tracing with Brave, Zipkin, and Eureka for service discovery.

## Project Structure

- **OrderService**: A sample service that simulates placing orders. This service calls the `ProductService` to fetch product details.
- **ProductService**: A sample service that provides product details.
- **EurekaServer**: Acts as a service discovery server to register and discover services.
- **ZipkinServer**: Responsible for collecting and displaying tracing information for all services in the architecture.
- **zipkin-server-3.4.2-exec.jar**: The executable JAR file for running a local Zipkin server.

## Setup Instructions

### Prerequisites

- **Java 17** or later
- **Maven** for building the projects
- **Zipkin** for distributed tracing (included in the project as `zipkin-server-3.4.2-exec.jar`)
- **Eureka Server** for service discovery

### Steps to Run the Project

1. **Start the Eureka Server**
   - Navigate to the `EurekaServer` directory.
   - Run the application:
     ```bash
     mvn spring-boot:run
     ```

2. **Start the Zipkin Server**
   - Run the Zipkin server from the root directory:
     ```bash
     java -jar zipkin-server-3.4.2-exec.jar
     ```
   - Zipkin should now be accessible at [http://localhost:9411](http://localhost:9411).

3. **Start the Order Service**
   - Navigate to the `OrderService` directory.
   - Run the application:
     ```bash
     mvn spring-boot:run
     ```

4. **Start the Product Service**
   - Navigate to the `ProductService` directory.
   - Run the application:
     ```bash
     mvn spring-boot:run
     ```

### Testing Distributed Tracing

1. Once all services are running, you can make a request to the `OrderService` to initiate tracing:
   ```bash
   curl http://localhost:8081/orders/{productId}
