
<h1 align="center">🛒DemoWebShop : Online Store Platform</h1>

- As part of this project, Selenium Automation scripts are built on Ecommerce Web application provided by Qspider. This portal allows the user to navigate through product categories and do shopping/Order Management.

- This project aims to test various functionalities of a web store using Selenium and TestNG. The web store being tested is 
   [DemoWebShop](https://demowebshop.tricentis.com/)

 <h1 align="center">📂 Project Structure  :</h1>
 
 ![DemoWebShopFolderStructure1](https://github.com/user-attachments/assets/d259f7dd-f8d4-4749-8c18-6e71d5ed5ea5)

 # 📝Folder Structure Overview :

 ```plaintext
com.Demowebshop
├── src
│   ├── main/java
│   │   ├── genericlib         # Generic libraries and utilities
│   │   │   ├── BaseTest.java         # Base setup for test cases
│   │   │   ├── CustomListener.java   # Listener for custom events
│   │   │   ├── Flib.java             # File library for Excel handling
│   │   │   ├── IAutoConstant.java    # Interface for constant values
│   │   │   ├── Worklib.java          # Work library for helper methods
│   │   ├── pompages           # Page Object Model classes
│   │       ├── BaseClass.java        # Common methods for all POM classes
│   │       ├── ProductPage.java      # Actions related to product catalog
│   │       ├── RegisterPage.java     # Actions for user registration
│   │       ├── SearchPage.java       # Product search functionality
│   │       ├── SigninPage.java       # Login page functionality
│   │       ├── WelcomePage.java      # Welcome/home page functionality
│   ├── main/resources        # Resource files (e.g., property files)
│   ├── test/java             # Test scripts
│       ├── TestScript
│           ├── AddToCartTest.java                  # Test for adding products to cart
│           ├── DisplayProductBasedOnConditions.java# Test for product filtering
│           ├── InvalidLoginTest.java               # Negative test for invalid login
│           ├── LoginTest.java                      # Positive login functionality test
│           ├── RegisterTest.java                   # User registration test
│           ├── SearchTest.java                     # Test for search functionality
│           ├── VerifySortFunctionality.java        # Sorting feature validation
│   ├── test/resources        # Test data and configuration
│       ├── TestData          # Input files for data-driven testing
├── test-output               # TestNG output reports
├── pom.xml                   # Maven dependencies

```
 

   <h1 align="center">📂 Project Phases  :</h1>


| Phase-1: Implementation | Phase-2: Execution | Phase-3: Maintenance |
|--------------|-------------|------------|
| Create Maven Project                     |Run test cases with Maven pom.xml.                         |Creating repository in GITHUB.  |
| Update pom.xml                           |Run test cases through Maven CLI. (Command Line Interface) |Commit the project code in local repository. |
| Create Page Objects                      |Run test cases using run. bat.                             |Push the project code to GITHUB remote repository from local GIT repository. |
| Create Basic Test case                   |Run test cases using Jenkins. (using bat file)             |Addressing issues and updates to automation scripts.
| Add logs to test case                    |Review test results and identify defects.                  |Reporting on automation performance and improvements. 
| Read common values from properties file  |Defect logging and management
| Run test case on desired browser         |
| Add extent report                        |
| Create Data Driven test case             | 
| Adding new test case                     | 
 
  <h1 align="center">🌐 Technologies Used:</h1>

  - **Selenium WebDriver** is being used as the core automation engine.

- **Eclipse IDE** is used to develop the automated scripts.

- **Build tool Maven** is used for build, execution and dependency purpose.

- **TestNG framework** is used for organizing the scripts.

- **Page Object Model** as the design pattern.

- **Test data** is read from Excel sheet at run time.

- **Git and Github** is used for version control management.

- **Cl tool Jenkins** is used to run the scripts.

- **Extent Spark Report** test results are generated for each run.

<h1 align="center">✨ Key Features :</h1>

- >> Validates login, registration, product search, sorting, and cart management.
- >> Supports data-driven testing with Excel.
- >> Generates custom reports for test execution.
- >> Enables cross-browser and parallel test execution.


<h1 align="center">  💼 Reporting :</h1>

  - TestNG Reports :
 ![WebShopReport](https://github.com/user-attachments/assets/01678f8e-9963-4c56-94ac-2c3401a47780)

 <h1 align="center">🤝 Contributing :</h1>

- Contributions are welcome! Feel free to submit issues and pull requests.
 
















    
