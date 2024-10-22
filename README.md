# My Calculator with Logic Seed For Andriod

## Objective
The goal of this assessment activity is to enhance the design and coding of a calculator application and to start using design patterns for app architecture. This project aims to provide a clear separation between the user interface and the calculator logic, ensuring maintainability and scalability.

## Requirements
This project requires you to:
1. Split the user interface-related Java code (`CalcActivity.java`) from the calculator logic (Calculator model/engine).
2. Implement all calculator functions, including memory logic and processing for both integers and real numbers.
3. Integrate memory buttons (MC, M+, M-, MR) into the calculator project.
4. Implement a percentage (%) button and a clear (C) button with specified functionalities.
5. Test the calculator with various cases and document the results with screenshots.

## Features
- **Basic Operations**: Addition, subtraction, multiplication, and division.
- **Memory Functions**:
  - **M+**: Adds the displayed number to memory.
  - **M-**: Subtracts the displayed number from memory.
  - **MC**: Clears the memory.
  - **MR**: Recalls the memory value to display.
- **Percentage Calculation**: Performs operations with percentage handling similar to Google’s calculator.
- **Clear Functionality**: Clears the current displayed number and resets all calculations.

## Installation
1. Download the project files from the provided ZIP archive (`My Calculator with Logic Seed.zip`).
2. Extract the files to your preferred location.
3. Open the project in Android Studio.
4. Build and run the application on an emulator or physical device.

## Usage
- Open the application and use the provided buttons for calculations.
- Use the memory functions to test memory-related features.
- Perform percentage calculations to validate functionality.

## Testing
- Conduct tests using various cases and document each test case with a screenshot.
- Ensure all features work as intended.

## Screenshots
- Include screenshots of test cases in the `screenshots` directory.

## Code Quality
- All code in this project is original and has been written from scratch.
- No code has been copied or pasted from external sources.

## Conclusion
This project demonstrates the importance of separating concerns in application development. By enhancing the design and coding practices, I have created a maintainable and scalable calculator application.

## Contact
For questions or feedback, please reach out to:
- **Email**: jhahitesh1994@gmail.com

## Functions

- **Test Case 1**: Basic Addition
  - **Input**: 5 + 3
  - **Expected Output**: 8
  - ![Basic Addition](screenshots/test_case_1.png)

- **Test Case 2**: Memory Add
  - **Input**: 10, M+
  - **Expected Output**: Memory should now contain 10
  - ![Memory Add](screenshots/test_case_2.png)

- **Test Case 3**: Percentage Calculation
  - **Input**: 200 * 10%
  - **Expected Output**: 20
  - ![Percentage Calculation](screenshots/test_case_3.png)

- **Test Case 4**: Clear Functionality
  - **Input**: 10, C (first press), C (second press)
  - **Expected Output**: Clear current display and reset calculator
  - ![Clear Functionality](screenshots/test_case_4.png)

