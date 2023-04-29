# User Management System

## Description
This is a simple Spring Boot project that provides basic user management functionality without using any database. The users are stored in memory and can be added, retrieved, updated, and deleted through RESTful APIs.

## Technologies Used
- Spring Boot
- Maven

## Endpoints
| HTTP Method | Endpoint           | Description                      |
|-------------|--------------------|----------------------------------|
| POST        | /users/addUser     | Adds a new user                  |
| GET         | /users/getUser/{userId} | Retrieves a user by their user ID |
| GET         | /users/getAllUsers | Retrieves all users              |
| PUT         | /users/updateUserInfo/{userId} | Updates a user's information by their user ID |
| DELETE      | /users/deleteUser/{userId} | Deletes a user by their user ID  |

## User Attributes
- `userId`: Unique identifier of the user
- `name`: Full name of the user
- `userName`: Username of the user
- `address`: Address of the user
- `phoneNumber`: Phone number of the user

## Getting Started
To run this project locally, follow these steps:

1. Clone this repository: `git clone https://github.com/your-username/user-management-system.git`
2. Navigate to the project directory: `cd user-management-system`
3. Build the project using Maven: `mvn clean install`
4. Run the project: `mvn spring-boot:run`

The project should now be running on `http://localhost:8080`.

## Contributing
If you'd like to contribute to this project, please fork the repository, make your changes, and submit a pull request.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.
