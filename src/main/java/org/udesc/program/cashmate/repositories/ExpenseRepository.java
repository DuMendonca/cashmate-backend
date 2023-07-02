package org.udesc.program.cashmate.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.udesc.program.cashmate.entities.Expense;
import org.udesc.program.cashmate.entities.MouthOfYears;

public interface ExpenseRepository extends MongoRepository<Expense, String> {
	Optional<List<Expense>> findByMouthOfYears(MouthOfYears mouthOfYears);
}
