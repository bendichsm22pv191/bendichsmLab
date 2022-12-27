package src.main.java.tech.reliab.course.bendichsm.bank.service.impl;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.Bank;
import src.main.java.tech.reliab.course.bendichsm.bank.entity.BankOffice;
import src.main.java.tech.reliab.course.bendichsm.bank.entity.Employee;
import src.main.java.tech.reliab.course.bendichsm.bank.service.BankService;

public class BankServiceImpl implements BankService {
    /**
     * Adds some amount of money to the Bank
     */
    @Override
    public void plusMoney(Bank bank, Integer money) {
        bank.setAllMoney(bank.getAllMoney() + money);
    }

    /**
     * Takes some amount of money from the Bank, if successful - return true, else - false
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
     * Adds some employee to the Bank
     */
    @Override
    public void plusEmployee(Bank bank, Employee employee) {
        bank.setCountEmployee(bank.getCountEmployee() + 1);
    }

    /**
     * Dismisses some employee from the Bank, if successful - return true, else - false
     */
    @Override
    public Boolean minusEmployee(Bank bank, Employee employee) {
        if(bank.getCountEmployee() > 1){
            bank.setCountEmployee(bank.getCountEmployee() - 1);
            return true;
        }
        return false;
    }
    @Override
    public void update(Bank bankUse, Bank bankAppdate){
        bankAppdate.setAllMoney(bankUse.getAllMoney());
        bankAppdate.setCountATM(bankUse.getCountATM());
        bankAppdate.setCountClients(bankUse.getCountClients());
        bankAppdate.setCountEmployee(bankUse.getCountEmployee());
        bankAppdate.setRateBank(bankUse.getRateBank());
        bankAppdate.setCountOffices(bankUse.getCountOffices());
        bankAppdate.setName(bankUse.getName());
        bankAppdate.setRentalPrice(bankUse.getRentalPrice());
        bankAppdate.setId(bankUse.getId());
    }
    @Override
    public void delite(Bank bank){
        bank = null;
    }
}
