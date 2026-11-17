package com.budgetapp.model;

public class Category {
    private String name;
    private double allocatedAmount;
    private double spentAmount;

    public Category(String name, double allocatedAmount) {
        this.name = name;
        this.allocatedAmount = allocatedAmount;
        this.spentAmount = 0.0;
    }

    public void addExpense(double amount) {
        if (amount > 0) {
            this.spentAmount += amount;
        }
    }

    public double getRemainingBalance() {
        return allocatedAmount - spentAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAllocatedAmount() {
        return allocatedAmount;
    }

    public void setAllocatedAmount(double allocatedAmount) {
        this.allocatedAmount = allocatedAmount;
    }

    public double getSpentAmount() {
        return spentAmount;
    }
}
