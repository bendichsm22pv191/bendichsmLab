package src.main.java.tech.reliab.course.toropchinda.bank.service;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.Bank;
import src.main.java.tech.reliab.course.toropchinda.bank.entity.BankAtm;
import src.main.java.tech.reliab.course.toropchinda.bank.entity.PaymentAccount;
import src.main.java.tech.reliab.course.toropchinda.bank.entity.Person;

public interface AtmService {
    Boolean putMoney(BankAtm bankAtm, PaymentAccount paymentAccount, Integer money);
    Boolean getMoney(BankAtm bankAtm, PaymentAccount paymentAccount, Integer money);
//    Boolean authorization();
}
