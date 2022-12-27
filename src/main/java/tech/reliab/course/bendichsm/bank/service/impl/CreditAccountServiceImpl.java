package src.main.java.tech.reliab.course.bendichsm.bank.service.impl;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.Bank;
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
    @Override
    public void update(CreditAccount creditAccountUse, CreditAccount creditAccountAppdate){
        creditAccountAppdate.setId(creditAccountUse.getId());
        creditAccountAppdate.setUser(creditAccountUse.getUser());
        creditAccountAppdate.setBankName(creditAccountUse.getBankName());
        creditAccountAppdate.setBeginCredit(creditAccountUse.getBeginCredit());
        creditAccountAppdate.setEmployee(creditAccountUse.getEmployee());
        creditAccountAppdate.setEndCredit(creditAccountUse.getEndCredit());
        creditAccountAppdate.setSumCredit(creditAccountUse.getSumCredit());
        creditAccountAppdate.setInterestRate(creditAccountUse.getInterestRate());
        creditAccountAppdate.setPaymentAccount(creditAccountUse.getPaymentAccount());
        creditAccountAppdate.setCountMonthCredit(creditAccountUse.getCountMonthCredit());
        creditAccountAppdate.setMonthPayment(creditAccountUse.getMonthPayment());
    }
    @Override
    public void delite(CreditAccount creditAccount){
        creditAccount = null;
    }
}
