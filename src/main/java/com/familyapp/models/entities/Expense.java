package com.familyapp.models.entities;

import com.familyapp.models.enumModels.ExpenseCategoryEnum;
import com.familyapp.models.enumModels.ExpenseTypeEnum;

import javax.persistence.*;
import java.math.BigInteger;
import java.time.LocalDate;


@Entity
@Table(name = "expenses")
public class Expense extends BaseEntity {
    private String expenseName;
    private ExpenseTypeEnum expenseType;
    private ExpenseCategoryEnum expenseCategory;
    private BigInteger amount;
    private LocalDate createdOn;
    private LocalDate dueDate;
    private String belongTo;
    private User addedFrom;


    public Expense() {
    }

    @Column(name = "expense_name", nullable = false)
    public String getExpenseName() {
        return expenseName;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "expense_type", nullable = false)
    public ExpenseTypeEnum getExpenseType() {
        return expenseType;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "expense_category", nullable = false)
    public ExpenseCategoryEnum getExpenseCategory() {
        return expenseCategory;
    }

    @Column
    public BigInteger getAmount() {
        return amount;
    }

    @Column(name = "created_on", nullable = false)
    public LocalDate getCreatedOn() {
        return createdOn;
    }

    @Column(name = "due_date", nullable = false)
    public LocalDate getDueDate() {
        return dueDate;
    }

    @ManyToOne
    public User getAddedFrom() {
        return addedFrom;
    }


    @Column(name = "belong_to", nullable = false)
    public String getBelongTo() {
        return belongTo;
    }

    public Expense setBelongTo(String belongTo) {
        this.belongTo = belongTo;
        return this;
    }

    public Expense setAddedFrom(User addedFrom) {
        this.addedFrom = addedFrom;
        return this;
    }

    public Expense setExpenseName(String expenseName) {
        this.expenseName = expenseName;
        return this;
    }

    public Expense setExpenseType(ExpenseTypeEnum expenseType) {
        this.expenseType = expenseType;
        return this;
    }

    public Expense setExpenseCategory(ExpenseCategoryEnum expenseCategory) {
        this.expenseCategory = expenseCategory;
        return this;
    }

    public Expense setAmount(BigInteger amount) {
        this.amount = amount;
        return this;
    }

    public Expense setCreatedOn(LocalDate createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    public Expense setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
        return this;
    }
}
