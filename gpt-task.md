# Genshin Impact Character - Programming Exercise

## Deadline
This work is due before the next class period.

## Instructions
For detailed instructions on how to complete and submit this assignment, please refer to the assignments section of the course syllabus or webpage.

### Learning Goals

This week's objectives include:
- Designing Java classes
- Implementing instance fields
- Writing constructor methods
- Creating getters and setters
- Applying the dot operator for object interaction
- Utilizing the main method for execution
- Understanding scope and variable shadowing

---

## Assignment

In the world of Teyvat, a land full of magic and diverse regions from the game Genshin Impact, you'll encounter a plethora of unique characters, each with their own elemental powers and combat skills. Your mission is to model these characters in Java, focusing on their attributes and abilities.

### Exercise 3.0 Introduction

Create a new Java file named `GenshinCharacter.java` within the `src` directory. This file will house the `GenshinCharacter` class. After setting up, we will begin by defining several characters directly within the `main` method.

### Exercise 3.1 More Characters

In the initial task, you successfully crafted a character. The world of Genshin Impact is vast and filled with numerous heroes. Let's expand our roster by creating two additional characters for a total of three. Implement this directly within the `main` method, ensuring you print the details for all characters to the console.

### Exercise 3.2 Fields

Refactor your approach to use class fields instead of local variables in the `main` method. Declare fields for `String name`, `String element`, `int level`, `int hp`, and `boolean isConscious` within the `GenshinCharacter` class without assigning initial values.

### Exercise 3.3 Getters and Setters

Implement encapsulation by setting the access level of fields to `private` and introducing getters and setters for each. These methods allow controlled access to the object's state from outside the class.

### Exercise 3.4 Constructor

Constructors streamline the process of initializing new objects. Implement a constructor for your `GenshinCharacter` class to efficiently assign values upon creation.

### Exercise 3.5 Create Characters

Utilize the constructor method to instantiate a few characters. Compare this approach to the direct assignment used in earlier exercises.

### Exercise 3.6 `printInfo` Method

Refactor the code to introduce a `printInfo` method that prints a character's details, enhancing code reusability and readability.

### Exercise 3.7 Elemental Burst

Characters in Genshin Impact unleash powerful Elemental Bursts. Model this behavior with an `elementalBurst` method in the `GenshinCharacter` class. This method should accept another character as an argument, simulating an attack, and adjust their `hp` accordingly.

### Exercise 3.8 Understanding Scope and Variable Shadowing

Explore examples provided on the concept of variable shadowing and how the `this` keyword can be used to distinguish between instance fields and local variables sharing the same name.

---

### Checklist
- Initial setup: Created `GenshinCharacter.java` and defined the class.
- Field implementation: Added `name`, `element`, `level`, `hp`, and `isConscious`.
- Encapsulation assured through getters and setters.
- Efficient object creation via constructor method.
- Introduced `printInfo` method for character details output.
- Simulated Elemental Burst attacks between characters.
- Reviewed and understood variable shadowing concepts.

### Reporting Bugs and Errors
Should you encounter any inconsistencies or errors in this exercise, please report them by creating a new issue with the title "Exercise *x* Error: *summary of error here*". Reported issues will be acknowledged and corrected accordingly.
