package org.udesc.program.cashmate.services.impl;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.udesc.program.cashmate.entities.Expense;
import org.udesc.program.cashmate.entities.MouthOfYears;
import org.udesc.program.cashmate.repositories.ExpenseRepository;
import org.udesc.program.cashmate.services.ExpenseService;

@AllArgsConstructor
@Service
public class ExpenseServiceImpl implements ExpenseService
{

	private final ExpenseRepository repository;

	@Override
	public List<Expense> getAllExpenses()
	{
		return repository.findAll();
	}

	@Override
	public List<Expense> getExpenseByMouth(int mouthOfYears)
	{
		if (mouthOfYears > 11) {
			throw new IllegalStateException("Illegal Access");
		}

		MouthOfYears value = MouthOfYears.values()[mouthOfYears];

		return repository.findByMouthOfYears(value).orElse(null);
	}

	@Override
	public Expense getExpenseById(String id)
	{
		return repository.findById(id).orElse(null);
	}

	@Override
	public void deleteExpenseById(String id)
	{
		Expense expense = repository.findById(id).orElse(null);
		if (expense ==  null) {
			throw new NoSuchElementException("Not found any elements by id");
		}

		repository.deleteById(id);
	}

	@Override
	public void updateExpenseById(Expense newExpense, String id)
	{
		Expense expense = repository.findById(id).orElse(null);
		if (expense ==  null) {
			throw new NoSuchElementException("Not found any elements by id");
		}

		updateNewValuesInExpense(newExpense, expense);
		repository.save(expense);
	}

	@Override
	public void createNewExpense(Expense expense)
	{
		repository.save(expense);
	}

	private static void updateNewValuesInExpense(Expense newExpense, Expense expense)
	{
		expense.setDescription(newExpense.getDescription());
		expense.setTag(newExpense.getTag());
		expense.setPrice(newExpense.getPrice());
		expense.setMouthOfYears(newExpense.getMouthOfYears());
	}
}
