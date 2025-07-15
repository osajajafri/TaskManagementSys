✅ Java Task Management System 
📌 Overview
This project is a command-line Task Management System implemented in Java, built to demonstrate key object-oriented programming (OOP) principles such as inheritance, encapsulation, cohesion, coupling, and interface-based design. It supports adding, viewing, and removing various types of tasks via a simple textual interface.
This was developed as part of the Object-Oriented Programming coursework for the F27SB: Software Development 2 module at Heriot-Watt University.
________________________________________
🎯 Features

•	📋 Add, view, and remove tasks via console

•	🔠 Supports 3 task types: PersonalTask, WorkTask, and TeamWorkTask

•	✅ Prevents duplicate Task IDs

•	💾 File I/O: Save tasks to file on exit and load from file on startup

•	🔔 Reminders via Remindable interface for work-related tasks

•	✅ Unit tested with JUnit

________________________________________
🧱 Task Types
The system defines a clear class hierarchy:

                 Task (abstract)
                /       \
      PersonalTask     WorkTask
                           |
                   TeamWorkTask

Each task includes:

•	id: unique identifier (required)

•	name: short title (required)

•	description: longer details (optional)

•	teamName: for teamwork tasks only

Work-related tasks implement the Remindable interface:

interface Remindable {

      void remindUser();

}

________________________________________
💻 How to Use
🏁 Starting the Program
On startup, the program:

1.	Loads all tasks from a local file (if present)

2.	Displays current tasks

3.	Calls remindUser() on all Remindable tasks

🧑‍💻 User Interface (Command-Line Menu)
markdown

Welcome to the Task Manager!
----------------------------
1. Show all tasks
2. Add a new task
3. Remove a task
4. Exit


Task types available:

•	Personal

•	Work

•	TeamWork

🛑 On Exit

•	Tasks are saved to file for persistence.

•	Example: tasks.txt or tasks.ser

________________________________________
📁 Project Structure
src/
├── Task.java                 # Abstract base class
├── PersonalTask.java         # Personal task type
├── WorkTask.java             # Implements Remindable
├── TeamWorkTask.java         # Extends WorkTask
├── TaskManager.java          # Manages list of tasks
├── TaskApp.java              # Main class with CLI
├── Remindable.java           # Interface
├── FileHandler.java          # Read/write to file
└── test/
    └── TaskManagerTest.java  # JUnit tests for add/remove

________________________________________
🧪 Testing
Unit tests are written using JUnit and include:

•	✅ Positive & negative tests for adding/removing tasks

•	✅ Duplicate ID rejection

•	✅ File load/save test cases

________________________________________
🧠 OOP Principles Demonstrated

Principle	        Application

Inheritance	      Different types of tasks extend the abstract Task class

Polymorphism	    Remindable interface and overridden toString() methods

Encapsulation	    Task fields are private, accessed via getters/setters

Cohesion	        Each class has a single clear purpose

Low Coupling	    Separation of UI, logic, file handling, and task definitions

________________________________________
💾 File Persistence
On exit, tasks are serialized and saved.
On startup, tasks are deserialized and loaded automatically.
Supports persistence of:

•	Task types

•	Fields like name, ID, description, and team name

•	Reminder behavior for work tasks

________________________________________
👨‍💻 Developer
Osaja Jafri
BSc Computer Science (AI)
Heriot-Watt University Dubai





