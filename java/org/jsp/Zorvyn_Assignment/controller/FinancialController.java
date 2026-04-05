package org.jsp.Zorvyn_Assignment.controller;

import java.time.LocalDate;
import java.util.List;

import org.jsp.Zorvyn_Assignment.model.FinancialRecord;
import org.jsp.Zorvyn_Assignment.model.Role;
import org.jsp.Zorvyn_Assignment.service.FinancialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/records")
public class FinancialController {

    @Autowired
    private FinancialService service;

    @PostMapping
    public FinancialRecord create(@RequestBody FinancialRecord record, @RequestParam Role role) {
        return service.createRecord(record, role);
    }

    @GetMapping
    public List<FinancialRecord> getAll() {
        return service.getAllRecords();
    }

    @PutMapping("/{id}")
    public FinancialRecord update(@PathVariable Long id,   @RequestBody FinancialRecord record, @RequestParam Role role) {
        return service.updateRecord(id, record, role);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id,  @RequestParam Role role) {
        service.deleteRecord(id, role);
    }

    @GetMapping("/filter")
    public List<FinancialRecord> filter(@RequestParam String start,
                                        @RequestParam String end) {
        return service.filterByDate(LocalDate.parse(start), LocalDate.parse(end));
    }
}