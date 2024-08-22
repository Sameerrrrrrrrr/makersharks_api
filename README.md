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
