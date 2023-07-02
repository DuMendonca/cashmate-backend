package org.udesc.program.cashmate.controller;

import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.udesc.program.cashmate.entities.Expense;
import org.udesc.program.cashmate.services.ExpenseService;

@RestController
@RequestMapping("/expense")
@AllArgsConstructor
public class ExpenseController
{
	private final ExpenseService expenseService;

	@GetMapping(path = "{expenseId}")
	public Expense getExpenseById(@PathVariable("expenseId") String expenseId) {
		return expenseService.getExpenseById(expenseId);
	}

	@GetMapping
	public List<Expense> fetchAllExpense() {
		return expenseService.getAllExpenses();
	}

	@GetMapping(path = "/mouth/{expenseMouth}")
	public List<Expense> fetchExpensesByMouth(@PathVariable("expenseMouth") int expenseMouth) {
		return expenseService.getExpenseByMouth(expenseMouth);
	}

	@PostMapping()
	public void registerNewExpense(@RequestBody Expense expense) {
		expenseService.createNewExpense(expense);
	}

	@DeleteMapping(path = "{expenseId}")
	public void deleteExpense(@PathVariable("expenseId") String expenseId) {
		expenseService.deleteExpenseById(expenseId);
	}

	@PutMapping(path = "{expenseId}")
	public void updateExpense(@PathVariable("expenseId") String expenseId, @RequestBody Expense expense){
		expenseService.updateExpenseById(expense, expenseId);
	}
}
