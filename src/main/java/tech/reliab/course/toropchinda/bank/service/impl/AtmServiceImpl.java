package src.main.java.tech.reliab.course.toropchinda.bank.service.impl;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.BankAtm;
import src.main.java.tech.reliab.course.toropchinda.bank.entity.Person;
import src.main.java.tech.reliab.course.toropchinda.bank.service.AtmService;

public class AtmServiceImpl implements AtmService {
    @Override
    public Boolean putClientMoney(BankAtm bankAtm, Person person, Integer money) {
        if(bankAtm.getMoneyPutAble()) {
            person.setSalary(person.getSalary() + money);
            return true;
        }
        return false;
    }

    @Override
    public Boolean getClientMoney(BankAtm bankAtm, Person person, Integer money) {
        if(bankAtm.getMoneyGetAble() && (person.getSalary() > money)) {
            person.setSalary(person.getSalary() - money);
            return true;
        }
        return false;
    }
}
