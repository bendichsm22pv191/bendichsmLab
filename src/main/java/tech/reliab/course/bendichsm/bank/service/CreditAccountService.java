package src.main.java.tech.reliab.course.bendichsm.bank.service;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.CreditAccount;

public interface CreditAccountService {

    //    public findCreditRate()
//
//    public extendCredit();
    Boolean endCreditAccount(CreditAccount CreditAccount);

    void update(CreditAccount creditAccountUse, CreditAccount creditAccountAppdate);

    void delite(CreditAccount creditAccount);
}
