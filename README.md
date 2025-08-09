# LIBRARY-MANAGEMENT

## Problem Statement
Design a console-based Library Management System that:
- Adds books
- Issues books
- Returns books
- Displays available books
- Persists data between runs

## Solution Approach
- **OOP Concepts**: `Book` (data model), `Library` (business logic), `FileHandler` (persistence).
- **Persistence**: Used `ObjectOutputStream` and `ObjectInputStream` for file-based storage (`books.dat`).
- **Collections**: Used `ArrayList` to manage the book list.
- **Menu-driven Console Application**: Implemented with `Scanner`.

## How to Run
1. Open `src` folder in any Java IDE (Eclipse, IntelliJ) or terminal.
2. Compile:
   ```bash
   javac Main.java Book.java Library.java FileHandler.java
