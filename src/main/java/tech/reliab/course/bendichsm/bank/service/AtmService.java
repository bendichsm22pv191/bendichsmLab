package src.main.java.tech.reliab.course.bendichsm.bank.service;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.BankAtm;
import src.main.java.tech.reliab.course.bendichsm.bank.entity.PaymentAccount;

public interface AtmService {
    Boolean putMoney(BankAtm bankAtm, PaymentAccount paymentAccount, Integer money);
    Boolean getMoney(BankAtm bankAtm, PaymentAccount paymentAccount, Integer money);
    void update(BankAtm bankAtmUse, BankAtm bankAtmAppdate);
    void delite(BankAtm bankAtm);
//    Boolean authorization();
}
