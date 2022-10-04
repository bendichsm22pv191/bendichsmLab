package src.main.java.tech.reliab.course.toropchinda.bank.service.impl;

import src.main.java.tech.reliab.course.toropchinda.bank.entity.CreditAccount;
import src.main.java.tech.reliab.course.toropchinda.bank.service.CreditAccountService;

public class CreditAccountServiceImpl implements CreditAccountService {
    /**
     * Завершение кредита(досрочное м. б.)
     */
    @Override
    public Boolean endCreditAccount(CreditAccount creditAccount) {
        if(creditAccount.getSumCredit() == 0) {
            creditAccount.deliteCreditAccount();
            return true;
        }
        return false;
    }
}
