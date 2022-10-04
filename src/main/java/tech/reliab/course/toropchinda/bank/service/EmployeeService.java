package src.main.java.tech.reliab.course.toropchinda.bank.service;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.BankOffice;
import src.main.java.tech.reliab.course.toropchinda.bank.entity.Employee;

public interface EmployeeService {
    void transferOffice(Employee employee, BankOffice bankOffice, Boolean offlineWork);
}
