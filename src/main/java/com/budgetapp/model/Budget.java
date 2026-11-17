package com.budgetapp.model;

import java.util.ArrayList;
import java.util.List;

public class Budget {
    private String monthYear;
    private double monthlyIncome;
    private List<Category> categories;

    public Budget(String monthYear, double monthlyIncome) {
        this.monthYear = monthYear;
        this.monthlyIncome = monthlyIncome;
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public double getTotalAllocated() {
        double total = 0.0;
        for (Category category : categories) {
            total += category.getAllocatedAmount();
        }
        return total;
    }

    // Core Zero-Based Budgeting rule: this must reach 0.00
    public double getUnallocatedFunds() {
        return monthlyIncome - getTotalAllocated();
    }

    public boolean isZeroBasedBalanced() {
        return Math.abs(getUnallocatedFunds()) < 0.01;
    }

    public String getMonthYear() {
        return monthYear;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public List<Category> getCategories() {
        return categories;
    }
}
