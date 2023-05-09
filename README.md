# 🎬 CinemaApp
This project is the implementation of a cinema tickets service using technologies Java Spring, Hibernate and SQL. It allows registrer user and admin, get, create, update and remove certain application elements.
## 📜 Features
- Registration with two roles (admin, user)
- Login with username and password
- Creation shopping cart, tickets and orders for user
- Creation movie session with movie and cinema hall
- Movie session update
- Implemented endpoints for user and admin access
## 👩‍💻 Used technologies:
- JDK `17` version
- Maven `3.1.1` version
- Spring `5.3.20` version
- Spring Security `5.6.10` version
- Hibernate `5.6.14` version
- MySql `8.0.22` version
- Apache Tomcat `9.0.73` version
## ⏱️ Getting Started
- Clone this github repository
- Create empty schema using MySQL
- Modify resources/db.properties with custom data 
- Build project with Maven
- Deploy the application using Tomcat
## 📑 Project Structure
### Packages
- `config`: contains configuration files for defining the application context and providing beans
- `controller`: contains controllers for endpoints with access for user roles and CustomGlobalExceprionHandler 
  - Endpoints for user and admin access [Postman Collection](https://www.postman.com/olenamatus/workspace/test-cinemaapp/collection/6983754-b59d7872-3864-4fe1-812b-eb9176dd8806?action=share&creator=6983754)
    - `POST: /register` - all
    - `GET: /cinema-halls` - user/admin
    - `GET: /movie-sessions/available` - user/admin
    - `GET: /movies` - user/admin
    - `POST: /cinema-halls` - admin
    - `POST: /movies` - admin
    - `POST: /movie-sessions` - admin
    - `PUT: /movie-sessions/{id}` - admin
    - `DELETE: /movie-sessions/{id}` - admin
    - `GET: /users/by-email` - admin
    - `GET: /orders` - user
    - `POST: /orders/complete` - user
    - `PUT: /shopping-carts/movie-sessions` - user
    - `GET: /shopping-carts/by-user` - user
- `dao`: contains ability to access and manipulate data in db
- `dto`: contains transfer data objects for rendering and moving data between application layers
- `exception`: contains custom exception (DataProcessingException)
- `lib`: contains validators and annotations for email and password
- `model`: contains models for db 
- `service`: contains mappers for dtos and services that responsible for the business logic of the application
- `util`: contains date and time formatting util
- `resources`: contains db.properties for db connection data

![image](https://user-images.githubusercontent.com/124172595/236883102-d2d2d9f6-1c40-4495-91b3-0affe41ad889.png)
## ✍️ Authors 
[Helen Matus](https://github.com/HelenMatus)
