# Swift Code API

The Swift Code API provides access to a database of SWIFT codes, which
are used for international bank transfers. The API allows users to retrieve information about SWIFT
codes for specific banks and branches, add new SWIFT codes, and delete existing ones.


## Endpoints

### 1. **GET /**
**Description:**
Returns a welcome message to indicate that the API is up and running.
**Response:**
```json
"Welcome to the Swift Code API!"
```
---

### 2. **GET /{swiftCode}**
**Description:**
Retrieve details of a specific SWIFT code, either for a headquarters or a branch.
**Parameters:**
- `swiftCode` (path variable): The SWIFT code to search for.
**Response (for headquarters):**
```json
{
 "address": "string",
 "bankName": "string",
 "countryISO2": "string",
 "countryName": "string",
 "isHeadquarter": true,
 "swiftCode": "BCHICLR10R2",
 "branches": [
 {
 "address": "string",
 "bankName": "string",
 "countryISO2": "string",
 "isHeadquarter": false,
 "swiftCode": "BCHICLR10R1"
 }
 ]
}
```
**Response (for branch):**
```json
{
 "address": "string",
 "bankName": "string",
 "countryISO2": "string",
 "countryName": "string",
 "isHeadquarter": false,
 "swiftCode": "BCHICLR10R1"
}
```
---
### 3. **GET /country/{countryISO2code}**
**Description:**
Retrieve all SWIFT codes for a specific country.
**Parameters:**
- `countryISO2code` (path variable): The 2-letter ISO code of the country.
**Response:**
```json
{
 "countryISO2": "PL",
 "countryName": "Poland",
 "swiftCodes": [
 {
 "address": "string",
 "bankName": "string",
 "countryISO2": "PL",
 "isHeadquarter": true,
 "swiftCode": "BCHICLR10R2"
 },
 {
 "address": "string",
 "bankName": "string",
 "countryISO2": "PL",
 "isHeadquarter": false,
 "swiftCode": "BCHICLR10R1"
 }
 ]
}
```
---
### 4. **POST /**
**Description:**
Adds a new SWIFT code entry to the database.
**Request Body:**
```json
{
 "address": "string",
 "bankName": "string",
 "countryISO2": "string",
 "countryName": "string",
 "isHeadquarter": true,
 "swiftCode": "BCHICLR10R2"
}
```
**Response:**
```json
{
 "message": "SWIFT code added successfully"
}
```
---
### 5. **DELETE /{swiftCode}**
**Description:**
Deletes a SWIFT code entry from the database.
**Parameters:**
- `swiftCode` (path variable): The SWIFT code to be deleted.
**Response:**
```json
{
 "message": "SWIFT code deleted successfully"
}
```
---


## Technologies Used
- Java 
- Spring Boot
- PostgreSQL (Database)
- Docker (for containerization)

  
## Running the Project
1. Clone the repository:
```bash
git clone https://github.com/KarRzu/swift-codes-api.git
```
2. Navigate into the project directory:
```bash
cd swift-codes-api
```
3. Build the project:
```bash
mvn clean install
```
4. Run the project:
```bash
mvn spring-boot:run
```
The application will start running on `http://localhost:8080`.
---
## Docker Setup
To run the project using Docker, you can build the Docker images for both the application and the
PostgreSQL database:
1. Build the Docker image for the application:
```bash
docker build -t swift-codes-api .
```
2. Start the containers:
```bash
docker-compose up
```
---
## Testing
You can test the API using Postman or `curl` commands.
### Example `curl` commands:
- To get all SWIFT codes for a specific country:
```bash
curl http://localhost:8080/country/PL
```
- To get details of a specific SWIFT code:
```bash
curl http://localhost:8080/BCHICLR10R2
```
- To add a new SWIFT code:
```bash
curl -X POST http://localhost:8080 -H "Content-Type: application/json" -d '{
 "address": "Some Address",
 "bankName": "Some Bank",
 "countryISO2": "PL",
 "countryName": "Poland",
 "isHeadquarter": true,
 "swiftCode": "BCHICLR10R3"
}'
```
- To delete a SWIFT code:
```bash
curl -X DELETE http://localhost:8080/BCHICLR10R2
```
---
