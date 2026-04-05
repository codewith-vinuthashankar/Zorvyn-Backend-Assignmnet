package org.jsp.Zorvyn_Assignment.service;

import java.time.LocalDate;
import java.util.List;



import org.jsp.Zorvyn_Assignment.model.FinancialRecord;
import org.jsp.Zorvyn_Assignment.model.Role;
import org.jsp.Zorvyn_Assignment.repository.FinancialRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancialService {
	    @Autowired
	    private FinancialRecordRepository repository;

	    public FinancialRecord createRecord(FinancialRecord record, Role role) {
	        if (role != Role.ADMIN) {
	            throw new RuntimeException("Access Denied");
	        }
	        return repository.save(record);
	    }

	    public List<FinancialRecord> getAllRecords() {
	        return repository.findAll();
	    }

	    public FinancialRecord updateRecord(Long id, FinancialRecord updated, Role role) {
	        if (role != Role.ADMIN) {
	            throw new RuntimeException("Access Denied");
	        }
	        FinancialRecord record = repository.findById(id).orElseThrow();
	        record.setAmount(updated.getAmount());
	        record.setCategory(updated.getCategory());
	        record.setType(updated.getType());
	        record.setDate(updated.getDate());
	        record.setDescription(updated.getDescription());
	        return repository.save(record);
	    }

	    public void deleteRecord(Long id, Role role) {
	        if (role != Role.ADMIN) {
	            throw new RuntimeException("Access Denied");
	        }
	        repository.deleteById(id);
	    }

	    public List<FinancialRecord> filterByDate(LocalDate start, LocalDate end) {
	        return repository.findByDateBetween(start, end);
	    }
	}

