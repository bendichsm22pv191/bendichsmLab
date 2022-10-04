package src.main.java.tech.reliab.course.toropchinda.bank.service.impl;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.BankOffice;
import src.main.java.tech.reliab.course.toropchinda.bank.entity.Employee;
import src.main.java.tech.reliab.course.toropchinda.bank.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void transferOffice(Employee employee, BankOffice bankOffice, Boolean offlineWork) {
        employee.setBankOffice(bankOffice);
        employee.setOfflineWork(offlineWork);
    }
}
