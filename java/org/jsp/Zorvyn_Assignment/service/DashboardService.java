package org.jsp.Zorvyn_Assignment.service;

import org.jsp.Zorvyn_Assignment.model.FinancialRecord;
import org.jsp.Zorvyn_Assignment.model.RecordType;
import org.jsp.Zorvyn_Assignment.repository.FinancialRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardService {

    @Autowired
    private FinancialRecordRepository repository;

    public double getTotalIncome() {
        return repository.findAll().stream()
                .filter(r -> r.getType() == RecordType.INCOME)
                .mapToDouble(FinancialRecord::getAmount)
                .sum();
    }

    public double getTotalExpense() {
        return repository.findAll().stream()
                .filter(r -> r.getType() == RecordType.EXPENSE)
                .mapToDouble(FinancialRecord::getAmount)
                .sum();
    }

    public double getNetBalance() {
        return getTotalIncome() - getTotalExpense();
    }
}