package org.udesc.program.cashmate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.udesc.program.cashmate.entities.Expense;
import org.udesc.program.cashmate.entities.MouthOfYears;
import org.udesc.program.cashmate.entities.Tag;
import org.udesc.program.cashmate.services.ExpenseService;

@SpringBootApplication
public class CashMateApplication
{

	public static void main(String[] args) {
		SpringApplication.run(CashMateApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ExpenseService service) {
		return args -> {
			Expense expense = new Expense("Car Expense",
				400.00f,
				Tag.TRANSPORT,
				MouthOfYears.JANUARY);

			service.createNewExpense(expense);
		};
	}

}
