package src.main.java.tech.reliab.course.toropchinda.bank.service;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.Bank;
import src.main.java.tech.reliab.course.toropchinda.bank.entity.BankAtm;
import src.main.java.tech.reliab.course.toropchinda.bank.entity.Person;

public interface AtmService {
    Boolean putClientMoney(BankAtm bankAtm, Person person, Integer money);
    Boolean getClientMoney(BankAtm bankAtm, Person person, Integer money);
//    Boolean authorization();
}
