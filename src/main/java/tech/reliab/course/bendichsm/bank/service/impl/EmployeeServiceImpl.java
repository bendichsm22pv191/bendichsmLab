package src.main.java.tech.reliab.course.bendichsm.bank.service.impl;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.BankOffice;
import src.main.java.tech.reliab.course.bendichsm.bank.entity.CreditAccount;
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
    @Override
    public void update(Employee employeeUse, Employee employeeAppdate){
        employeeAppdate.setBank(employeeUse.getBank());
        employeeAppdate.setId(employeeUse.getId());
        employeeAppdate.setName(employeeUse.getName());
        employeeAppdate.setSurname(employeeUse.getSurname());
        employeeAppdate.setPatronymic(employeeUse.getPatronymic());
        employeeAppdate.setBirthday(employeeUse.getBirthday());
        employeeAppdate.setPost(employeeUse.getPost());
        employeeAppdate.setSalary(employeeUse.getSalary());
        employeeAppdate.setBankOffice(employeeUse.getBankOffice());
        employeeAppdate.setCreditAble(employeeUse.getCreditAble());
        employeeAppdate.setOfflineWork(employeeUse.getOfflineWork());
    }

    @Override
    public void delite(Employee employee){
        employee = null;
    }
}
