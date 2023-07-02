package org.udesc.program.cashmate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.udesc.program.cashmate.entities.Expense;
import org.udesc.program.cashmate.services.ExpenseService;

@RestController
public class ExpenseController
{
	@Autowired
	ExpenseService expenseService;

	@GetMapping("/expense")
	public Expense getExpenseById(){
		//expenseService.getById();
		return new Expense();
	}
}
