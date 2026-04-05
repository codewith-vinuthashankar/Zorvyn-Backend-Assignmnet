package org.jsp.Zorvyn_Assignment.repository;

import java.time.LocalDate;
import java.util.List;

import org.jsp.Zorvyn_Assignment.model.FinancialRecord;
import org.jsp.Zorvyn_Assignment.model.RecordType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialRecordRepository extends JpaRepository<FinancialRecord, Long>{
	
	List<FinancialRecord> findByType(RecordType type);

    List<FinancialRecord> findByDateBetween(LocalDate start, LocalDate end);

}
