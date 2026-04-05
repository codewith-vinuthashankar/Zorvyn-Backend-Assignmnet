# Zorvyn-Backend-Assignmnet

# Overview

This project is a backend system for managing financial records with role-based access control. It supports CRUD operations, filtering, and dashboard summaries.

# Tech Stack

* Java
* Spring Boot
* Spring Data JPA
* MySQL / H2 Database

# User Roles

* **ADMIN** → Full access (create, update, delete)
* **ANALYST** → View records and dashboard
* **VIEWER** → Read-only access

# Features

 1. User Management

* Create users
* Assign roles (ADMIN, ANALYST, VIEWER)
* Update user status (ACTIVE, INACTIVE)

 2. Financial Records

* Add income/expense
* Update/delete records
* Filter by date

 3. Dashboard

* Total Income
* Total Expense
* Net Balance

# Access Control

* Only ADMIN can create/update/delete records
* VIEWER can only view data
* ANALYST can view and analyze data

# API Endpoints

### User APIs

* POST /users
* GET /users
* PUT /users/{id}/role
* PUT /users/{id}/status

### Financial APIs

* POST /records
* GET /records
* PUT /records/{id}
* DELETE /records/{id}
* GET /records/filter

### Dashboard API

* GET /dashboard/summary


# Assumptions

* Role is passed as request parameter for simplicity
* No authentication implemented (mock role-based access)

# How to Run

1. Clone the repository
2. Open in IDE
3. Run Spring Boot application
4. Test APIs using Postman

