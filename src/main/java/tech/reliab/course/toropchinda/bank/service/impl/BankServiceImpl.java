package src.main.java.tech.reliab.course.toropchinda.bank.service.impl;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.Bank;
import src.main.java.tech.reliab.course.toropchinda.bank.entity.Employee;
import src.main.java.tech.reliab.course.toropchinda.bank.service.BankService;

public class BankServiceImpl implements BankService {
    /**
     * Банк получает деньги
     */
    @Override
    public void plusMoney(Bank bank, Integer money) {
        bank.setAllMoney(bank.getAllMoney() + money);
    }

    /**
     * С банка списывают деньги если возможно иначе false
     */
    @Override
    public Boolean minusMoney(Bank bank, Integer money) {
        if(bank.getAllMoney() > money){
            bank.setAllMoney(bank.getAllMoney() - money);
            return true;
        }
        return false;
    }

    /**
     * Банк получает сотрудника
     */
    @Override
    public void plusEmployee(Bank bank, Employee employee) {
        bank.setCountEmployee(bank.getCountEmployee() + 1);
    }

    /**
     * Сотрудник уходит из банка (1ин мин. остается)
     */
    @Override
    public Boolean minusEmployee(Bank bank, Employee employee) {
        if(bank.getCountEmployee() > 1){
            bank.setCountEmployee(bank.getCountEmployee() - 1);
            return true;
        }
        return false;
    }
}
