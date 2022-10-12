package src.main.java.tech.reliab.course.bendichsm.bank.service.impl;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.CreditAccount;
import src.main.java.tech.reliab.course.bendichsm.bank.service.CreditAccountService;

public class CreditAccountServiceImpl implements CreditAccountService {
    /**
     * Closes the credit, if successful - return true, else - false
     */
    @Override
    public Boolean endCreditAccount(CreditAccount creditAccount) {
        if(creditAccount.getSumCredit() == 0) {
            creditAccount = null;
            return true;
        }
        return false;
    }
}
