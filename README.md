# Zero-Based Budgeting Web Application

A Java-based personal finance web application built around the **Zero-Based Budgeting (ZBB)** methodology, where every dollar of monthly income is assigned a specific category until unallocated funds equal zero (`Income - Allocations = $0`).

## Project Structure
* `src/main/java/com/budgetapp/model/` — Core domain models (`Budget`, `Category`)
* `src/main/java/com/budgetapp/service/` — Business logic and zero-sum reallocation rules (`BudgetService`)
* `src/main/webapp/` — JSP user interface (to be implemented in Module 4)
