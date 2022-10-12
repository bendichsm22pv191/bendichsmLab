package src.main.java.tech.reliab.course.bendichsm.bank.service.impl;

import src.main.java.tech.reliab.course.bendichsm.bank.entity.*;
import src.main.java.tech.reliab.course.bendichsm.bank.entity.*;
import src.main.java.tech.reliab.course.bendichsm.bank.service.BankOfficeService;

import java.util.Calendar;
import java.util.Date;


public class BankOfficeServiceImpl implements BankOfficeService {
    /**
     * Adds ATM in Bank Office,if successful - true, else - false
     */
    @Override
    public Boolean plusBankOfficeATM(BankOffice bankOffice, Integer quantityATM) {
        if(bankOffice.getAtmPutAble()) {
            bankOffice.setQuantityATM(bankOffice.getQuantityATM() + quantityATM);
            return true;
        }
        return false;
    }


    /**
     *  Gives credit to the user if possible return credit, else - null
     */
    public CreditAccount getCredit(BankOffice bankOffice, Integer id, User user, String bankName, Date beginCredit,
                                   Date endCredit, Integer sumCredit, Integer interestRate, Employee employee,
                                   PaymentAccount paymentAccount, Integer countMonthCredit) {
        CreditAccount creditAccount = new CreditAccount(id, user, bankName, beginCredit, endCredit, sumCredit,
                interestRate, employee, paymentAccount, countMonthCredit);
        if ((bankOffice.getAllOfficeMoney() > creditAccount.getSumCredit()) && bankOffice.getCreditAble()){
            user.setCreditAccounts(creditAccount);
            return creditAccount;
        }
        return null;
    }
}
