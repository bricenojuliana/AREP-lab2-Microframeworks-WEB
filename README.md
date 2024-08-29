# Web Framework Development for REST Services and Static File Management

## Description

This project is a web framework that extends a basic web server to support both REST services and static file management. The framework allows developers to define REST services using lambda functions, extract query parameters from requests, and specify the directory for static files. This facilitates the development and deployment of web applications with both dynamic and static content.

## How to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/bricenojuliana/AREP-lab2-Microframeworks-WEB.git
   cd AREP-lab2-Microframeworks-WEB
   ```

2. **Build the Project**:
   Ensure [Maven](https://maven.apache.org/) is installed and run:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:
   Execute the main class (`Main`) to start the server:
   ```bash
   java -cp target/sparkprimer-1.0-SNAPSHOT.jar Main
   ```

4. **Access the Application**:
   - REST Services: `http://localhost:8080/App/hello?name=YourName`
   - Static Files: `http://localhost:8080/index.html`

## Architecture

### Project Tree

```
src
├── main
│   ├── java
│   │   └── edu
│   │       └── escuelaing
│   │           └── arem
│   │               └── ASE
│   │                   └── app
│   │                       ├── App.java
│   │                       ├── Request.java
│   │                       ├── Response.java
│   │                       ├── Service.java
│   │                       └── WebServer.java
│   └── resources
│       ├── cocora.jpg
│       ├── cristales.jpeg
│       ├── example.png
│       ├── guatavita.jpg
│       ├── index.html
│       ├── la-conejera.jpg
│       ├── script.js
│       ├── styles.css
│       └── villa-de-leyva.jpeg
└── test
    └── java
        └── edu
            └── escuelaing
                └── arem
                    └── ASE
                        └── app
                            ├── AppTest.java
                            ├── RequestTest.java
                            ├── ResponseTest.java
                            └── WebServerTest.java

```

### Components

1. **App Class**:
   - Manages REST service registration and static file directory.
   - Methods:
     - `get(String url, Service s)`: Registers a REST service.
     - `staticfiles(String location)`: Specifies the directory for static files.

2. **WebServer Class**:
   - Handles HTTP requests and routes them to the appropriate service or static file.
   - Methods:
     - `startServer()`: Starts the web server.

3. **Request Class**:
   - Parses query parameters from requests.
   - Methods:
     - `getValues(String key)`: Retrieves the value for a query parameter.

4. **Response Class**:
   - Represents the response sent to the client.
   - Methods:
     - `setBody(String body)`: Sets the response body.
     - `getBody()`: Retrieves the response body.

5. **Service Interface**:
   - Defines the contract for REST services.
   - Method:
     - `getValue(Request request, Response response)`: Handles requests and generates responses.


## Tests

### Results and Explanations

![image](https://github.com/user-attachments/assets/fa708212-4ab0-47ee-8468-172aa27cbd7e)

#### AppTest

- **Description**: Tests the functionality of the `App` class, focusing on service registration and static file configuration.

  - **Service Registration**:
    - Test the registration of a new service at `/App/test`.
    - **Result**: Passed. The service was successfully registered and is accessible.

  - **Static Files Directory**:
    - Test the configuration of the static files directory.
    - **Result**: Passed. The directory was correctly set and verified.

#### RequestTest

- **Description**: Tests the `Request` class, including handling of query strings and edge cases.

  - **Empty Query String**:
    - Test how the class handles an empty query string.
    - **Result**: Passed. Returns `null` for empty query strings.

  - **Null Query String**:
    - Test how the class handles a `null` query string.
    - **Result**: Passed. Returns `null` for `null` query strings.

  - **Valid Query Strings**:
    - Test retrieval of values from a well-formed query string.
    - **Result**: Passed. Correctly retrieves values for valid queries.

  - **Malformed Query Strings**:
    - Test handling of malformed query strings.
    - **Result**: Passed. Handles malformed queries appropriately.

#### ResponseTest

- **Description**: Tests the `Response` class, including setting and retrieving the response body.

  - **Set and Get Body**:
    - Test setting and getting the response body.
    - **Result**: Passed. The body is correctly set and retrieved.

  - **Set Body with Null**:
    - Test handling of `null` values for the response body.
    - **Result**: Passed. Handles `null` values correctly.

  - **Set Body with Empty String**:
    - Test handling of empty strings for the response body.
    - **Result**: Passed. Handles empty strings appropriately.

#### WebServerTest

- **Description**: Tests the `WebServer` class, focusing on singleton instance retrieval and server startup.

  - **Singleton Instance**:
    - Test retrieval of the singleton instance of the `WebServer`.
    - **Result**: Passed. The singleton pattern is correctly implemented.

  - **Server Startup**:
    - Test the server's ability to start without exceptions.
    - **Result**: Passed. The server can start on port 8080 without issues.

### Browser Tests

1. **Static Files**:
   - **Index.html**: Verify that the `index.html` file is correctly served from the `resources` directory.
     ![image](https://github.com/user-attachments/assets/b9f3f77a-590a-4425-a300-7bad6b94a7bd)
     ![image](https://github.com/user-attachments/assets/bfdb2e98-070d-4901-9301-f143cb317ec4)



   - **Images**: Ensure that image files are correctly served from the static files directory.
     ![image](https://github.com/user-attachments/assets/22695e60-fc95-448b-8b3b-6824f152509d)

2. **GET Requests**:
   - **Greeting**: Access the URL `/App/hello` with and without query parameters to verify the greeting functionality. Example: `http://localhost:8080/App/hello?name=Juliana`.
     ![image](https://github.com/user-attachments/assets/237f618b-065b-400c-9292-e87c6137cf6b)

   - **Pi Value**: Access the URL `/App/pi` to check that the server correctly returns the value of pi.
     ![image](https://github.com/user-attachments/assets/da1d244f-3149-45a5-b966-ed130be40671)

## Author

* **Juliana Briceño** - Developer and Author of the Project
