# Java Quiz Application

A multi-class Java quiz application with improved structure, error handling, and user experience.

## Project Structure

```
├── Ques.java
├── Quizalgo.java
├── Quizm.java
└── README.md
```

## Files Description

### 1. **Ques.java**
- Encapsulates a single quiz question
- Stores question text, options, and correct answer
- Methods:
  - `display()` - Shows question and options
  - `isCorrect(int userAnswer)` - Validates user answer
  - Getters for question, options, and correct answer

### 2. **Quizm.java**
- Manages the entire quiz flow
- Stores and initializes all questions
- Methods:
  - `displayWelcome()` - Shows welcome message
  - `startQuiz()` - Runs the quiz loop
  - `displayScore()` - Shows final results with percentage
  - `convertAnswerToIndex()` - Converts A/B/C/D to 0/1/2/3


## How It Works

1. **Welcome Message** - Displays a greeting
2. **Quiz Loop** - For each question:
   - Shows the question and options (A, B, C, D)
   - Takes user input
   - Validates input (rejects invalid answers)
   - Checks if answer is correct
   - Shows feedback immediately
3. **Final Score** - Displays:
   - Number of correct answers
   - Total questions
   - Percentage score

## Features

**Multi-class design** - Clean separation of concerns  
**Input validation** - Rejects invalid answers and repeats questions  
**Better feedback** - Shows which option was correct if user fails  
**Percentage calculation** - Displays score as percentage  
**User-friendly** - Clear prompts and formatted output  
**Extendable** - Easy to add more questions  

## Sample Answers

For testing:
- Question 1: A (New Delhi)
- Question 2: A (10)
- Question 3: B (Jupiter)
- Question 4: A (True)


## Requirements

- Java Development Kit (JDK) 8 or higher
- Terminal/Command prompt

