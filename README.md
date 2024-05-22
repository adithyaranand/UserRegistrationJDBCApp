# User Registration JDBC App

This project is allows users to register, storing their information in a MySQL database using JDBC.

## Prerequisites
- JDK (Java Development Kit)
- Eclipse IDE (or any Java IDE of your choice)
- Apache Tomcat Server
- MySQL Database

## Setup
1. **Clone the Repository**: 
    ```bash
    git clone https://github.com/yourusername/UserRegistrationJDBCApp.git
    ```

2. **Import Project into Eclipse**: 
    - Open Eclipse IDE
    - Go to File > Import > Existing Projects into Workspace
    - Select the cloned project directory

3. **Set Up Apache Tomcat Server**:
    - Download and install Apache Tomcat Server if you haven't already.
    - Configure Tomcat in Eclipse: 
        - Go to Window > Preferences > Server > Runtime Environments.
        - Add Apache Tomcat Server and provide the installation directory.

4. **Set Up MySQL Database**:
    - Install MySQL Database if you haven't already.
    - Create a database named `firstdb`.
    - Execute the SQL script `create_database.sql` located in the `SQL` folder to create the necessary table.

5. **Add MySQL JDBC Driver**:
    - Download the MySQL JDBC driver JAR file.
    - Add it to your project's build path.

## Usage
1. **Run the Project**:
    - Right-click on the project in Eclipse.
    - Select Run As > Run on Server.
    - Choose the configured Apache Tomcat Server and click Finish.

2. **Access the Registration Form**:
    - Open a web browser and navigate to `http://localhost:8080/UserRegistrationJDBCApp/register.html`.

3. **Register a User**:
    - Fill out the registration form with your details and submit the form.

4. **View Success Page**:
    - Upon successful registration, you will be redirected to a success page.

## Contributing
Contributions are welcome! Feel free to open an issue or submit a pull request for any improvements or new features you'd like to add.

## License
This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
