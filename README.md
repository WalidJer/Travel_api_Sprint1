
# Travel Management REST API-Backend (Sprint 1)

## Overview

The Travel Management Server is a Java Spring Boot application that provides a RESTful API for managing travel-related data.  
It includes 4 core entities: **Aircraft, Airport, City, and Passenger.**

Each entity has its own **DTO**, **Service**, **Repository**, and **Controller** layers to handle business logic, data persistence, and HTTP requests following best practices.

---

## Entities

### City

Represents a city that contains airports and passengers.

**Attributes:**

- `id` (auto-generated): Unique identifier.
- `name`: City name.
- `province`: Province or state.
- `population`: Population count.

**Relationships:**

- One city has many airports.
- One city has many passengers.

---

### Airport

Represents an airport located in a city.

**Attributes:**

- `id` (auto-generated): Unique identifier.
- `name`: Name of the airport.
- `code`: Airport three-letter code.
- `city`: The city where the airport is located.

**Relationships:**

- Many airports belong to one city.
- Many aircraft can use many airports (for takeoff and landing).

---

### Passenger

Represents a person who can fly on multiple aircraft.

**Attributes:**

- `id` (auto-generated): Unique identifier.
- `firstName`: Passenger's first name.
- `lastName`: Passenger's last name.
- `phoneNumber`: Contact phone number.
- `city`: City where passenger lives.

**Relationships:**

- Many passengers live in one city.
- Many passengers can fly on many aircraft.

---

### Aircraft

Represents an aircraft used for travel.

**Attributes:**

- `id` (auto-generated): Unique identifier.
- `model`: Model of the aircraft.
- `airlineName`: Airline operating the aircraft.
- `capacity`: Maximum number of passengers.

**Relationships:**

- Many aircraft can carry many passengers.
- Many aircraft can use many airports for operations.

---

## Architecture

- Spring Boot REST API
- Layered architecture:
    - **Entity layer** — Models.
    - **DTO layer** — To avoid circular references.
    - **Repository layer** — Spring Data JPA for persistence.
    - **Service layer** — Business logic.
    - **Controller layer** — HTTP endpoints.
- MySQL database.
- Lombok-free code: full constructors, setters, getters explicitly written.
- Bidirectional relationships handled carefully using DTOs.

---

## Setup Instructions

### Clone the repository

```bash
git clone https://github.com/WalidJer/Travel_api_Sprint1`
cd Travel_api_Sprint1
```

### Build the project

Make sure you have Maven installed, then run:


### Run the application

Start Spring Boot server:

```bash
mvn spring-boot:run
```

By default, the API will run at:

```
http://localhost:8080
```

---

## API Endpoints

### City

| Method | Endpoint | Description |
| ------ | -------- | ----------- |
| GET | `/cities` | Get all cities |
| GET | `/cities/{id}` | Get city by ID |
| POST | `/cities` | Create new city |
| PUT | `/cities/{id}` | Update city |
| DELETE | `/cities/{id}` | Delete city |

---

### Airport

| Method | Endpoint | Description |
| ------ | -------- | ----------- |
| GET | `/airports` | Get all airports |
| GET | `/airports/{id}` | Get airport by ID |
| POST | `/airports` | Create new airport |
| PUT | `/airports/{id}` | Update airport |
| DELETE | `/airports/{id}` | Delete airport |

---

### Passenger

| Method | Endpoint | Description |
| ------ | -------- | ----------- |
| GET | `/passengers` | Get all passengers |
| GET | `/passengers/{id}` | Get passenger by ID |
| POST | `/passengers` | Create new passenger |
| PUT | `/passengers/{id}` | Update passenger |
| DELETE | `/passengers/{id}` | Delete passenger |

---

### Aircraft

| Method | Endpoint | Description |
| ------ | -------- | ----------- |
| GET | `/aircrafts` | Get all aircraft |
| GET | `/aircrafts/{id}` | Get aircraft by ID |
| POST | `/aircrafts` | Create new aircraft |
| PUT | `/aircrafts/{id}` | Update aircraft |
| DELETE | `/aircrafts/{id}` | Delete aircraft |

---

## Testing The API

- Use the included **plain text file** in `postman/Travel_API_sprint1.txt` to copy-paste requests into Postman.

---

## Database Configuration

- MySQL database must be running.
- Database credentials can be configured in:

```properties
src/main/resources/application.properties
```

---

## Technologies Used

- Java 21
- Spring Boot 3
- Spring Data JPA
- MySQL
- Maven
- Postman

---


