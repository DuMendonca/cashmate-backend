package org.udesc.program.cashmate.services;

import java.util.List;
import org.udesc.program.cashmate.entities.Expense;

public interface ExpenseService
{
	List<Expense> getAllExpenses();

	List<Expense> getExpenseByMouth(int mouthOfYears);

	Expense getExpenseById(String id);

	void deleteExpenseById(String id);

	void updateExpenseById(Expense newExpense, String id);

	void createNewExpense(Expense expense);
}