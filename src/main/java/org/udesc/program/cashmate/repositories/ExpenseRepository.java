package org.udesc.program.cashmate.repositories;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.udesc.program.cashmate.entities.Expense;
import org.udesc.program.cashmate.entities.MouthOfYears;

public interface ExpenseRepository extends MongoRepository<Expense, Long> {
	List<Expense> findByMouth(MouthOfYears mouthOfYears);
}
