package src.main.java.tech.reliab.course.bendichsm.bank.service.impl;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.BankOffice;
import src.main.java.tech.reliab.course.bendichsm.bank.entity.Employee;
import src.main.java.tech.reliab.course.bendichsm.bank.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    /**
     * Moves an employee to another post
     */
    @Override
    public void transferOffice(Employee employee, BankOffice bankOffice, Boolean offlineWork) {
        employee.setBankOffice(bankOffice);
        employee.setOfflineWork(offlineWork);
    }
}
