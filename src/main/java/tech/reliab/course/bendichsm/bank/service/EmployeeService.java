package src.main.java.tech.reliab.course.bendichsm.bank.service;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.BankOffice;
import src.main.java.tech.reliab.course.bendichsm.bank.entity.Employee;

public interface EmployeeService {
    void transferOffice(Employee employee, BankOffice bankOffice, Boolean offlineWork);
}
