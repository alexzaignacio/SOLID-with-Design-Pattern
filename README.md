# NEU Library Resource Management System (SOLID Refactor)

## Problem Statement

The original system featured a `Student` class with specific methods like `borrowBook()` and `borrowJournal()`.

This design created **Tight Coupling**, where the high-level module (`Student`) depended directly on low-level modules (`Book`, `Journal`).

This resulted in:

- **Inflexible Design:** Adding new resources like "Audio Books" or "Theses" required modifying the `Student` class.
- **Brittle Code:** Changes in specific resource logic could unintentionally break the student's ability to borrow other items.

---

## Proposed Solution

This refactor applies the **Dependency Inversion Principle (DIP)**.

Instead of the `Student` class depending on concrete implementations, both the `Student` and the resources now depend on an abstraction called `LibraryResource`.

---

## Applied SOLID Principles

### Dependency Inversion Principle (DIP)

High-level modules (`Student`) no longer depend on low-level modules (`Book` / `Journal`); both depend on the `LibraryResource` interface.

### Open/Closed Principle (OCP)

The system is now open for extension (adding `AudioBook`, `Capstone`, etc.) but closed for modification of the `Student` class.

### Single Responsibility Principle (SRP)

The `Student` class is only responsible for the action of borrowing, while each resource class handles its own specific data.
