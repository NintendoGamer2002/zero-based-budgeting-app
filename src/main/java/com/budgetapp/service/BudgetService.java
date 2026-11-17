package com.budgetapp.service;

import com.budgetapp.model.Budget;
import com.budgetapp.model.Category;

public class BudgetService {

    // Moves money between categories when unexpected expenses happen
    public boolean transferFunds(Budget budget, String fromCategoryName, String toCategoryName, double amount) {
        if (amount <= 0) {
            return false;
        }

        Category source = findCategory(budget, fromCategoryName);
        Category destination = findCategory(budget, toCategoryName);

        if (source == null || destination == null) {
            return false;
        }

        if (source.getRemainingBalance() < amount) {
            return false; // Not enough funds in source category
        }

        source.setAllocatedAmount(source.getAllocatedAmount() - amount);
        destination.setAllocatedAmount(destination.getAllocatedAmount() + amount);
        return true;
    }

    private Category findCategory(Budget budget, String name) {
        for (Category category : budget.getCategories()) {
            if (category.getName().equalsIgnoreCase(name)) {
                return category;
            }
        }
        return null;
    }
}
