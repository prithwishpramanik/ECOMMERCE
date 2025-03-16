# ECOMMERCE: End-to-End E-commerce Platform

![ECOMMERCE Platform Screenshot](screenshot.png)

Welcome to the ECOMMERCE project! This repository showcases a comprehensive e-commerce platform built with a modern technology stack, aiming to deliver a seamless shopping experience for users and efficient management tools for administrators.

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technology Stack](#technology-stack)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)
- [Project Structure](#project-structure)
- [Contributing](#contributing)
- [License](#license)

## Overview

The ECOMMERCE platform is designed to simulate a real-world online shopping environment. It encompasses both the front-end and back-end components, ensuring a full-fledged application that handles everything from product display to order processing.

## Features

- **User Authentication**: Secure registration and login functionalities for customers and administrators.
- **Product Management**: Administrators can add, update, or remove products with detailed descriptions and images.
- **Shopping Cart**: Users can add products to their cart, modify quantities, and proceed to checkout.
- **Order Processing**: Seamless order placement with order history tracking for users.
- **Responsive Design**: Optimized for various devices, ensuring a consistent user experience across platforms.

## Technology Stack

- **Front-end**:
  - [React](https://reactjs.org/): A JavaScript library for building user interfaces.
  - [Vite](https://vitejs.dev/): A build tool that provides a rapid development server and optimized build process.
- **Back-end**:
  - [Spring Boot](https://spring.io/projects/spring-boot): A framework for building production-ready Java applications.
- **Languages**:
  - JavaScript (66.8%)
  - CSS (26.7%)
  - Java (5.6%)
  - HTML (0.9%)

*Note: The percentage indicates the proportion of each language used in the project.*

## Getting Started

To set up the project locally, follow the steps below.

### Prerequisites

- [Node.js](https://nodejs.org/en/) (v14 or higher)
- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) (v11 or higher)
- [Vite](https://vitejs.dev/)

### Installation

1. **Clone the repository**:

   ```bash
   git clone https://github.com/prithwishpramanik/ECOMMERCE.git
   ```

2. **Navigate to the project directory**:

   ```bash
   cd ECOMMERCE
   ```

3. **Install front-end dependencies**:

   ```bash
   npm install
   ```

4. **Navigate to the back-end directory**:

   ```bash
   cd Ecomerce-BackEnd
   ```

5. **Build the back-end application**:

   ```bash
   ./mvnw clean install
   ```

6. **Run the back-end application**:

   ```bash
   ./mvnw spring-boot:run
   ```

7. **Navigate back to the front-end directory**:

   ```bash
   cd ..
   ```

8. **Start the front-end development server**:

   ```bash
   npm run dev
   ```

The application should now be running, and you can access it through your browser.

## Project Structure

```
ECOMMERCE/
├── Ecomerce-BackEnd/       # Spring Boot back-end application
│   ├── src/
│   └── ...
├── public/                 # Public assets for the front-end
├── src/                    # React front-end application
│   ├── components/
│   ├── pages/
│   └── ...
├── .eslintrc.cjs           # ESLint configuration
├── .gitignore              # Git ignore file
├── README.md               # Project README
├── index.html              # Main HTML file
├── package-lock.json       # NPM lock file
├── package.json            # NPM package configuration
└── vite.config.js          # Vite configuration
```

## Contributing

Contributions are welcome! If you have suggestions or improvements, please fork the repository and submit a pull request. Ensure that your code adheres to the project's coding standards and includes appropriate tests.

## License

This project is licensed under the MIT License. For more details, refer to the [LICENSE](LICENSE) file.

---

*Note: This README is based on the information available in the repository and may be subject to updates.* 