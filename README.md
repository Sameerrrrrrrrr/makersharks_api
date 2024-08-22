# Makersharks Search API

## Overview

The Makersharks Search API is a Spring Boot application that provides a RESTful endpoint for querying manufacturers based on their location, nature of business, and manufacturing processes. This proof of concept uses an H2 in-memory database for simplicity.

## Features

- Search for manufacturers by location, nature of business, and manufacturing processes.
- Paginate results to manage large data sets.
- API documentation provided via Swagger.

## Prerequisites

- Java 17 or later
- Maven (for building the project)
- IDE (e.g., IntelliJ IDEA, Eclipse) or command line

### Clone the Repository

```bash
git clone https://github.com/Sameerrrrrrrrr/makersharks-api.git
cd makersharks-api

## Build and Run the Application

### Build the Project

To build the project, use the following command:

```bash
./mvnw clean install

## Run the Application

To start the application, use the following command:

```bash
./mvnw spring-boot:run

- **The application will be accessible at [http://localhost:8080](http://localhost:8080).**
```
## API Endpoints

### Search Suppliers

- **Endpoint:** `/api/supplier/query`
- **Method:** `POST`
- **Description:** Retrieve a list of manufacturers based on the specified search criteria.

#### Request Parameters

- **`location`** (required): The city/location to filter by (e.g., "India").
- **`natureOfBusiness`** (required): The nature of the business (e.g., "small_scale").
- **`manufacturingProcesses`** (required): The manufacturing process to filter by (e.g., "3d_printing").
- **`page`** (optional): The page number for pagination (default is 0).
- **`size`** (optional): The number of items per page (default is 10).

### Example cURL Command

To make a request to the API, you can use the following cURL command:

```bash
curl -X POST "http://localhost:8080/api/supplier/query" \
     -d "location=India" \
     -d "natureOfBusiness=small_scale" \
     -d "manufacturingProcesses=3d_printing" \
     -d "page=0" \
     -d "size=10"
```
### Response

The response will be a JSON object containing a list of suppliers that match the criteria. Each supplier object will include the following fields:

- **`supplierId`**: Unique identifier for the supplier.
- **`companyName`**: Name of the company.
- **`website`**: Website URL of the company.
- **`location`**: City where the supplier is located.
- **`natureOfBusiness`**: Nature of the business.
- **`manufacturingProcesses`**: Manufacturing processes the supplier is capable of.

### Swagger Documentation
 you can access the API documentation at:

- **Swagger UI:** [http://localhost:8080/swagger-ui-custom.html](http://localhost:8080/swagger-ui-custom.html)
- **API Docs:** [http://localhost:8080/api-docs](http://localhost:8080/api-docs)

### Configuration

The application uses an H2 in-memory database by default. Configuration details can be found in `src/main/resources/application.properties`.

### Running Tests

To run unit tests, use the following command:

```bash
./mvnw test
```
