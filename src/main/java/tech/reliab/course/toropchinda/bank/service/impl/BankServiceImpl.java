package src.main.java.tech.reliab.course.toropchinda.bank.service.impl;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.Bank;
import src.main.java.tech.reliab.course.toropchinda.bank.entity.Employee;
import src.main.java.tech.reliab.course.toropchinda.bank.service.BankService;

public class BankServiceImpl implements BankService {
    @Override
    public void plusMoney(Bank bank, Integer money) {
        bank.setAllMoney(bank.getAllMoney() + money);
    }

    @Override
    public Boolean minusMoney(Bank bank, Integer money) {
        if(bank.getAllMoney() > money){
            bank.setAllMoney(bank.getAllMoney() - money);
            return true;
        }
        return false;
    }

    @Override
    public void plusEmployee(Bank bank, Employee employee) {
        bank.setCountEmployee(bank.getCountEmployee() + 1);
    }

    @Override
    public Boolean minusEmployee(Bank bank, Employee employee) {
        if(bank.getCountEmployee() > 1){
            bank.setCountEmployee(bank.getCountEmployee() - 1);
            return true;
        }
        return false;
    }
}
