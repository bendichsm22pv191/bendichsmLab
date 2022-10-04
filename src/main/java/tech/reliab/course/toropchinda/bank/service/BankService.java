package src.main.java.tech.reliab.course.toropchinda.bank.service;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.Bank;
import src.main.java.tech.reliab.course.toropchinda.bank.entity.Employee;

public interface BankService {
    void plusMoney(Bank bank, Integer money);
    Boolean minusMoney(Bank bank, Integer money);
    void plusEmployee(Bank bank, Employee employee);
    Boolean minusEmployee(Bank bank, Employee employee);

}
