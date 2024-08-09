# SauceDemo
QA Automation Project with Selenium and Java for SauceDemo This project automates tests for the SauceDemo web application using Selenium WebDriver and Java. It includes scripts to verify login, product details, and cart operations. Features:  Test Automation Login Tests Product Verification Cart Operations TestNG Framework

# Test Plan

## Project Overview
This test plan outlines the approach for automating test cases for the **Sauce Demo** website using Selenium. The goal is to validate key functionalities of the website, including user authentication, product management, and checkout processes, ensuring that the site performs as expected under various scenarios.

## Scope
The scope of this testing includes:

- User login/logout functionality.
- Product interactions, such as adding/removing items from the cart.
- Navigation and display of product details.
- Checkout process, including payment and order confirmation.
- Sorting and filtering of products.

## Test Objectives
- Ensure the integrity of the user authentication process.
- Validate that the cart functionality operates correctly across sessions.
- Confirm that products can be viewed, sorted, filtered, and managed in the cart.
- Verify the checkout process from cart review to order confirmation.

## Testing Tools
- **Selenium** for automation.
- **TestNG** for test management and reporting.

## Assumptions
- The website is stable and available for testing.
- Valid user credentials are available for testing.

## Deliverables
- Automated test scripts for the identified test cases.
- A report summarizing test results, including pass/fail status for each test case.

## Test Execution
The tests will be executed locally and can be integrated with CI/CD pipelines for continuous testing. The results will be analyzed, and any defects found will be reported for further investigation.

## Test Cases

### 1. Login with Valid Credentials
- **Steps:**
  1. Navigate to the login page.
  2. Enter a valid username and password.
  3. Click on the "Login" button.
- **Expected Result:** The user is redirected to the Products page.

### 2. Login with Invalid Credentials
- **Steps:**
  1. Navigate to the login page.
  2. Enter an invalid username and/or password.
  3. Click on the "Login" button.
- **Expected Result:** An error message is displayed indicating incorrect credentials.

### 3. Add a Product to the Cart
- **Steps:**
  1. Log in with valid credentials.
  2. Navigate to the Products page.
  3. Click on the "Add to Cart" button for any product.
- **Expected Result:** The product is added to the cart, and the cart counter updates.

### 4. Remove a Product from the Cart
- **Steps:**
  1. Add a product to the cart.
  2. Click on the "Remove" button for the product in the cart.
- **Expected Result:** The product is removed from the cart, and the cart counter updates accordingly.

### 5. Complete a Purchase
- **Steps:**
  1. Add a product to the cart.
  2. Proceed to checkout.
  3. Enter shipping information.
  4. Click on "Finish" to complete the purchase.
- **Expected Result:** A confirmation page is displayed with the order details.

### 6. View Product Details
- **Steps:**
  1. Log in with valid credentials.
  2. Navigate to the Products page.
  3. Click on a product name or image.
- **Expected Result:** The product details page is displayed with relevant information.

### 7. Sort Products by Price (Low to High)
- **Steps:**
  1. Log in with valid credentials.
  2. Navigate to the Products page.
  3. Select "Price (low to high)" from the sorting dropdown.
- **Expected Result:** The products are sorted by price in ascending order.

### 8. Filter Products by Category
- **Steps:**
  1. Log in with valid credentials.
  2. Navigate to the Products page.
  3. Apply a filter by category (e.g., "T-Shirts").
- **Expected Result:** Only products within the selected category are displayed.

### 9. Logout
- **Steps:**
  1. Log in with valid credentials.
  2. Click on the menu button.
  3. Click on "Logout".
- **Expected Result:** The user is logged out and redirected to the login page.

### 10. Check Cart Persistence After Logout/Login
- **Steps:**
  1. Add a product to the cart.
  2. Log out of the application.
  3. Log in again with the same credentials.
- **Expected Result:** The cart retains the previously added product.