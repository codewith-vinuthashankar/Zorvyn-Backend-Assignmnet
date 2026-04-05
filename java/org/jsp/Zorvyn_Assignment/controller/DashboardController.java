package org.jsp.Zorvyn_Assignment.controller;

import org.jsp.Zorvyn_Assignment.service.DashboardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {

    @Autowired
    private DashboardService service;

    @GetMapping("/summary")
    public String summary() {
        return "Income: " + service.getTotalIncome() +
                ", Expense: " + service.getTotalExpense() +
                ", Net: " + service.getNetBalance();
    }
}