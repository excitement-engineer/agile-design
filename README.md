# Continuous refactoring

This project aims to show how you can keep a codebase clean over time as the requirements change using SOLID principles.

This project was used purely as a practice routine.

Initially, the program prints a 3x3 board of numbers to the console. After each iteration new requirements are added and the project is adjusted
in order to accomodate these new requirements whilst still keeping the code as clean as possible.

As an added challenge I have added the restriction that **I cannot make any breaking changes to the
API** of any of the classes/interfaces when I make adjustments to the code.

## Requirements per iteration: 

1. Display a 3x3 board to the console.
2. Display the board as JSON
3. Allow variable size of the Board (so instead of 3x3 it should be able to do NxN)
4. The content of the board should be specified dynamically (instead of number, it should also allow for characters)
